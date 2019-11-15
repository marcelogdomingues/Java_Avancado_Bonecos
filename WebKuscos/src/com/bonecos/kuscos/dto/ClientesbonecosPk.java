/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.bonecos.kuscos.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the CLIENTESBONECOS table.
 */
public class ClientesbonecosPk implements Serializable
{
	protected long idCliente;

	/** 
	 * This attribute represents whether the primitive attribute idCliente is null.
	 */
	protected boolean idClienteNull;

	/** 
	 * Sets the value of idCliente
	 */
	public void setIdCliente(long idCliente)
	{
		this.idCliente = idCliente;
	}

	/** 
	 * Gets the value of idCliente
	 */
	public long getIdCliente()
	{
		return idCliente;
	}

	/**
	 * Method 'ClientesbonecosPk'
	 * 
	 */
	public ClientesbonecosPk()
	{
	}

	/**
	 * Method 'ClientesbonecosPk'
	 * 
	 * @param idCliente
	 */
	public ClientesbonecosPk(final long idCliente)
	{
		this.idCliente = idCliente;
	}

	/** 
	 * Sets the value of idClienteNull
	 */
	public void setIdClienteNull(boolean idClienteNull)
	{
		this.idClienteNull = idClienteNull;
	}

	/** 
	 * Gets the value of idClienteNull
	 */
	public boolean isIdClienteNull()
	{
		return idClienteNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof ClientesbonecosPk)) {
			return false;
		}
		
		final ClientesbonecosPk _cast = (ClientesbonecosPk) _other;
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (idClienteNull != _cast.idClienteNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + (int) (idCliente ^ (idCliente >>> 32));
		_hashCode = 29 * _hashCode + (idClienteNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.bonecos.kuscos.dto.ClientesbonecosPk: " );
		ret.append( "idCliente=" + idCliente );
		return ret.toString();
	}

}
