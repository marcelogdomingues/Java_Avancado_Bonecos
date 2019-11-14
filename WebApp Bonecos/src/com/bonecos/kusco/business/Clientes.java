package com.bonecos.kusco.business;

import javax.jws.WebService;

import com.bonecos.kusco.dao.ClientesbonecosDao;
import com.bonecos.kusco.dto.Clientesbonecos;
import com.bonecos.kusco.exceptions.ClientesbonecosDaoException;
import com.bonecos.kusco.factory.ClientesbonecosDaoFactory;

@WebService
public class Clientes {
	public int insertCliente(Clientesbonecos cliente) {
		ClientesbonecosDao clientesDao = ClientesbonecosDaoFactory.create();
		try {
			clientesDao.insert(cliente);
		} catch (ClientesbonecosDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	private boolean validaNome (Clientesbonecos cliente) throws ClientesbonecosDaoException {
		boolean valida = true;
		//Verificar se o nome � null
		if(cliente.getNome()==null) {
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
		return valida;
	}
}
