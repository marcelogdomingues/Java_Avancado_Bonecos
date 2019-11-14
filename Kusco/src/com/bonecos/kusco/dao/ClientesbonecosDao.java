/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.bonecos.kusco.dao;

import java.util.Date;
import com.bonecos.kusco.dto.*;
import com.bonecos.kusco.exceptions.*;

public interface ClientesbonecosDao
{
	/** 
	 * Inserts a new row in the CLIENTESBONECOS table.
	 */
	public ClientesbonecosPk insert(Clientesbonecos dto) throws ClientesbonecosDaoException;

	/** 
	 * Updates a single row in the CLIENTESBONECOS table.
	 */
	public void update(ClientesbonecosPk pk, Clientesbonecos dto) throws ClientesbonecosDaoException;

	/** 
	 * Deletes a single row in the CLIENTESBONECOS table.
	 */
	public void delete(ClientesbonecosPk pk) throws ClientesbonecosDaoException;

	/** 
	 * Returns the rows from the CLIENTESBONECOS table that matches the specified primary-key value.
	 */
	public Clientesbonecos findByPrimaryKey(ClientesbonecosPk pk) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public Clientesbonecos findByPrimaryKey(long idCliente) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria ''.
	 */
	public Clientesbonecos[] findAll() throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public Clientesbonecos[] findWhereIdClienteEquals(long idCliente) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria 'NUMERO_CC = :numeroCc'.
	 */
	public Clientesbonecos[] findWhereNumeroCcEquals(long numeroCc) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria 'NOME = :nome'.
	 */
	public Clientesbonecos[] findWhereNomeEquals(String nome) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria 'MORADA = :morada'.
	 */
	public Clientesbonecos[] findWhereMoradaEquals(String morada) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria 'DATA_NASCIMENTO = :dataNascimento'.
	 */
	public Clientesbonecos[] findWhereDataNascimentoEquals(Date dataNascimento) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria 'DATA_INSERCAO = :dataInsercao'.
	 */
	public Clientesbonecos[] findWhereDataInsercaoEquals(Date dataInsercao) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the criteria 'GENERO = :genero'.
	 */
	public Clientesbonecos[] findWhereGeneroEquals(String genero) throws ClientesbonecosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the specified arbitrary SQL statement
	 */
	public Clientesbonecos[] findByDynamicSelect(String sql, Object[] sqlParams) throws ClientesbonecosDaoException;

	/** 
	 * Returns all rows from the CLIENTESBONECOS table that match the specified arbitrary SQL statement
	 */
	public Clientesbonecos[] findByDynamicWhere(String sql, Object[] sqlParams) throws ClientesbonecosDaoException;

}
