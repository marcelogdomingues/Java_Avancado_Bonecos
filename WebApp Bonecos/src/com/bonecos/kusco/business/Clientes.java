package com.bonecos.kusco.business;

import com.bonecos.kusco.dao.ClientesbonecosDao;
import com.bonecos.kusco.dto.Clientesbonecos;
import com.bonecos.kusco.exceptions.ClientesbonecosDaoException;
import com.bonecos.kusco.factory.ClientesbonecosDaoFactory;


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
}
