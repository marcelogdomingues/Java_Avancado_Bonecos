package com.bonecos.kuscos.business;

import java.util.Calendar;

import javax.jws.WebMethod;

//import java.sql.Date;
//import java.text.DateFormat;
//import java.util.Calendar;

import javax.jws.WebService;

import com.bonecos.kuscos.dao.ClientesbonecosDao;
import com.bonecos.kuscos.dto.Clientesbonecos;
import com.bonecos.kuscos.exceptions.ClientesbonecosDaoException;
import com.bonecos.kuscos.factory.ClientesbonecosDaoFactory;

@WebService
public class ClientesBonecos {
	@WebMethod
	public int insertCliente(Clientesbonecos cliente) {
		
		int res = 0;
		
		ClientesbonecosDao clientesDao = ClientesbonecosDaoFactory.create();
		
		try {
//			if(validaNome(cliente) && validaCC(cliente) && validatesAddress(cliente) 
//					&& validaDataNascimento(cliente) && validatesInsertionDate(cliente) && validaGenero(cliente)) {
			clientesDao.insert(cliente);
//			}
//			else res = -1;
		} catch (ClientesbonecosDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	private boolean validaNome (Clientesbonecos cliente) throws ClientesbonecosDaoException {
		
		boolean valida = true;
		
		//Verificar se o nome é null
		if(cliente.getNome() == null) {
			valida = false;
			throw new ClientesbonecosDaoException("Por favor insira um nome.");
		}
		
		//Verificar se existem digitos no nome
		for(int i = 0; i < cliente.getNome().length(); i++) {
			if(Character.isDigit(cliente.getNome().charAt(i))) {
				valida = false;
				throw new ClientesbonecosDaoException("O nome não pode conter dígitos.");
			}
		}
		
		//Verificar se a primeira letra é maiuscula
		if(Character.isLowerCase(cliente.getNome().charAt(0))) {
			valida = false;
			throw new ClientesbonecosDaoException("Comece o nome por maiuscula.");
		}
		
		//Verificar se o comprimento é menos que 100
		if(cliente.getNome().length() > 100) {
			valida = false;
			throw new ClientesbonecosDaoException("O nome não pode ter mais de 100 caracteres.");
		}
		return valida;
	}
	
	private boolean validaDataNascimento (Clientesbonecos cliente) throws ClientesbonecosDaoException {
		
		boolean valida = true;
		
		//Verificar se a data de nascimento é superior à data de hoje
		if(Calendar.getInstance().before(cliente.getDataNascimento())) {
			valida = false;
			throw new ClientesbonecosDaoException("A data de nascimento tem de ser superior à data de hoje.");
		}
		return valida;
	}
	
	private boolean validaGenero (Clientesbonecos cliente) throws ClientesbonecosDaoException {
		
		boolean valida = true;
		
		//Verificar se o género inserido é válido
		if(cliente.getGenero() != "M" || cliente.getGenero() != "F") {
			valida = false;
			throw new ClientesbonecosDaoException("Insira um género válido.");
		}
		return valida;
	}
	
	 /**
     * Method that checks if the client's CC number has 9 digits
     * @return false if the number is invalid
     * @throws ClientesbonecosDaoException
     */
    private boolean validaCC(Clientesbonecos bonecos) throws ClientesbonecosDaoException {
       
        boolean valid = true;
       
        String numberCC = "" + bonecos.getNumeroCc();
        int size = numberCC.length();
       
        if (size != 9) {
            valid = false;
            throw new ClientesbonecosDaoException("O CC não tem o numero de digitos corretos");
        }
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
            throw new ClientesbonecosDaoException("O enderenço de morada fornecido excede o limte");
        }
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
            throw new ClientesbonecosDaoException("Tem de fazer uma inserção!");
           
        }
        else if(Calendar.getInstance().before(bonecos.getDataInsercao())){
            valid = false;
            throw new ClientesbonecosDaoException("O prazo para inserção já foi ultrapassado!");
        }
        return valid;
    }
}