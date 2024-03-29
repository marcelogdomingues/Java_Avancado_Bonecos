package com.bonecos.kuscos.business;

import java.util.Calendar;

import javax.jws.WebMethod;

//import java.sql.Date;
//import java.text.DateFormat;
//import java.util.Calendar;

import javax.jws.WebService;

import com.bonecos.kuscos.dao.ClientesbonecosDao;
import com.bonecos.kuscos.dto.Clientesbonecos;
import com.bonecos.kuscos.dto.ClientesbonecosPk;
import com.bonecos.kuscos.exceptions.ClientesbonecosDaoException;
import com.bonecos.kuscos.factory.ClientesbonecosDaoFactory;

@WebService
public class ClientesBonecos {
	
	/**
	 * Inserts a client
	 * @returns false if the insertion fails
	 */
	@WebMethod
	public int insertCliente(Clientesbonecos cliente) {
		
		int res = 0;
		
		ClientesbonecosDao clientesDao = ClientesbonecosDaoFactory.create();
		
		try {
			if(validaNome(cliente) && validaCC(cliente) && validatesAddress(cliente) 
					&& validaDataNascimento(cliente) && validatesInsertionDate(cliente) && validaGenero(cliente)) {
			clientesDao.insert(cliente);
			}
			else 
				res = -1;
		} catch (ClientesbonecosDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * Updates a client
	 * @returns false if the update fails
	 */
	@WebMethod
	public int updateCliente(Clientesbonecos cliente) {
		
		int res = 0;
		
		ClientesbonecosDao clientesDao = ClientesbonecosDaoFactory.create();
		ClientesbonecosPk clientePk = new ClientesbonecosPk(cliente.getIdCliente());
		
		try {
			if(validaNome(cliente) && validaCC(cliente) && validatesAddress(cliente) 
					&& validaDataNascimento(cliente) && validatesInsertionDate(cliente) && validaGenero(cliente)) {
			clientesDao.update(clientePk, cliente);
			}
			else res = -1;
		} catch (ClientesbonecosDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
    
	/**
	 * Deletes a client
	 *@returns false if the update fails
	 */
    @WebMethod
    public int deleteCliente(Clientesbonecos cliente) {
        
        int res = 0;
       
        ClientesbonecosPk clientePk = new ClientesbonecosPk(cliente.getIdCliente());
        ClientesbonecosDao clientesDao = ClientesbonecosDaoFactory.create();
       
        try {
            if(clientesDao.findByPrimaryKey(cliente.getIdCliente()) != null) {
                clientesDao.delete(clientePk);
            }
            else res = -1;
        } catch (ClientesbonecosDaoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return res;
    }
    
    @WebMethod
    public Clientesbonecos[] getListaClientes() {
    	
    	ClientesbonecosDao cliDao = ClientesbonecosDaoFactory.create();
    	Clientesbonecos[] listCli = null;
    	
    	try {
			listCli = cliDao.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return listCli;
    }
    
    
    @WebMethod
    public Clientesbonecos[] pesquisaPorCC(Clientesbonecos cliente) {
    	
    	ClientesbonecosDao cliDao = ClientesbonecosDaoFactory.create();
    	Clientesbonecos[] listCli = null;
        
    	try {
			listCli = cliDao.findWhereNumeroCcEquals(cliente.getNumeroCc());
			
		} catch (ClientesbonecosDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return listCli;
    }
	
    /**
     * Validates the client's name 
     * @return false if the name is null, has digits, exceeds the length's limit or if the first letter isn't in caps lock
     * @throws ClientesbonecosDaoException
     */
	private boolean validaNome (Clientesbonecos cliente) throws ClientesbonecosDaoException {
		
		boolean valida = true;
		
		//Verificar se o nome � null
		if(cliente.getNome() == null) {
			valida = false;
			throw new ClientesbonecosDaoException("Por favor insira um nome.");
		}
		
		//Verificar se existem digitos no nome
		for(int i = 0; i < cliente.getNome().length(); i++) {
			if(Character.isDigit(cliente.getNome().charAt(i))) {
				valida = false;
				throw new ClientesbonecosDaoException("O nome n�o pode conter d�gitos.");
			}
		}
		
		//Verificar se a primeira letra � maiuscula
		if(Character.isLowerCase(cliente.getNome().charAt(0))) {
			valida = false;
			throw new ClientesbonecosDaoException("Comece o nome por maiuscula.");
		}
		
		//Verificar se o comprimento � menos que 100
		if(cliente.getNome().length() > 100) {
			valida = false;
			throw new ClientesbonecosDaoException("O nome n�o pode ter mais de 100 caracteres.");
		}
		System.out.println("Nome: " + valida);
		return valida;
	}
	
	/**
	 * Validates the birth date of the client
	 * @return false if the date birth is superior to the current date
	 */
	private boolean validaDataNascimento (Clientesbonecos cliente) throws ClientesbonecosDaoException {
		
		boolean valida = true;
		
		//Verificar se a data de nascimento � superior � data de hoje
		if(Calendar.getInstance().before(cliente.getDataNascimento())) {
			valida = false;
			throw new ClientesbonecosDaoException("A data de nascimento tem de ser superior � data de hoje.");
		}
		System.out.println("DataNascimento: " + valida);
		return valida;
	}
	
	/**
	 * Validates the client's gender
	 * @return false if the client don't select a gender between 'M' or 'F'
	 */
	private boolean validaGenero (Clientesbonecos cliente) throws ClientesbonecosDaoException {
		
		boolean valida = true;
		
		//Verificar se o g�nero inserido � v�lido
		if(!cliente.getGenero().equals("M") && !cliente.getGenero().equals("F")) {
			valida = false;
			throw new ClientesbonecosDaoException("Insira um g�nero v�lido.");
		}
		System.out.println("Genero: " + valida);
		return valida;
	}
	
	 /**
     * Method that checks if the client's CC number has 9 digits
     * @return false if the number is invalid or if the CC is already registed
     * @throws ClientesbonecosDaoException
     */
    private boolean validaCC(Clientesbonecos bonecos) throws ClientesbonecosDaoException {
       
        boolean valid = true;
        
        ClientesbonecosDao lista = new ClientesbonecosDaoFactory().create();
        
        
        int size = String.valueOf(bonecos.getNumeroCc()).length();
        
        System.out.println("Tamanho: " + size);
        
        if (size != 8) {
            valid = false;
            throw new ClientesbonecosDaoException("O CC n�o tem o numero de digitos corretos");
        }
//        else if(lista.findWhereNumeroCcEquals(bonecos.getNumeroCc()) != null) {
//        	valid = false;	
//        }
        System.out.println("CC: " + valid);
        return valid;
    }
   
    /**
     * Method that validates the client's address
     * @return false if the address is null or if exceeds the limit's size
     * @throws ClientesbonecosDaoException
     */
    private boolean validatesAddress(Clientesbonecos bonecos) throws ClientesbonecosDaoException{
       
        boolean valid = true;
       
        String address = bonecos.getMorada();
       
        if(address == null){
            valid = false;
            throw new ClientesbonecosDaoException("A morada tem de ser preenchida!");
        }
        else if (address.length() > 100) {
            valid = false;
            throw new ClientesbonecosDaoException("O enderen�o de morada fornecido excede o limte");
        }
        System.out.println("Address: " + valid);
        return valid;
    }
   
    /**
     * Method that validates the insertion's date
     * @return false if there is no insertion or if the user tries to make an insertion a day after
     * @throws ClientesbonecosDaoException
     */
    private boolean validatesInsertionDate(Clientesbonecos bonecos) throws ClientesbonecosDaoException {
       
        boolean valid = true;
        if(bonecos.getDataInsercao().toString().equals(null)) {
            valid = false;
            throw new ClientesbonecosDaoException("Tem de fazer uma inser��o!");
           
        }
        else if(bonecos.getDataNascimento().after(bonecos.getDataInsercao())){
        	valid = false;
        	throw new ClientesbonecosDaoException("O prazo para inser��o j� foi ultrapassado!");
        }
        else if(Calendar.getInstance().after(bonecos.getDataInsercao())){
            valid = false;
            throw new ClientesbonecosDaoException("O prazo para inser��o j� foi ultrapassado!");
        }
        System.out.println("InsertionDate: " + valid);
        return valid;
    }
    
}