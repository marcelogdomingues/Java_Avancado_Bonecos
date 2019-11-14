package com.bonecos.kusco.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.bonecos.kusco.dto.*;

public class ClientesbonecosForm extends ActionForm
{
	protected String idCliente;

	protected String numeroCc;

	protected String nome;

	protected String morada;

	protected String dataNascimento;

	protected String dataInsercao;

	protected String genero;

	protected String crudMethod;

	/** 
	 * Sets the value of idCliente
	 */
	public void setIdCliente(String idCliente)
	{
		this.idCliente = idCliente;
	}

	/** 
	 * Gets the value of idCliente
	 */
	public String getIdCliente()
	{
		return idCliente;
	}

	/** 
	 * Sets the value of numeroCc
	 */
	public void setNumeroCc(String numeroCc)
	{
		this.numeroCc = numeroCc;
	}

	/** 
	 * Gets the value of numeroCc
	 */
	public String getNumeroCc()
	{
		return numeroCc;
	}

	/** 
	 * Sets the value of nome
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/** 
	 * Gets the value of nome
	 */
	public String getNome()
	{
		return nome;
	}

	/** 
	 * Sets the value of morada
	 */
	public void setMorada(String morada)
	{
		this.morada = morada;
	}

	/** 
	 * Gets the value of morada
	 */
	public String getMorada()
	{
		return morada;
	}

	/** 
	 * Sets the value of dataNascimento
	 */
	public void setDataNascimento(String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	/** 
	 * Gets the value of dataNascimento
	 */
	public String getDataNascimento()
	{
		return dataNascimento;
	}

	/** 
	 * Sets the value of dataInsercao
	 */
	public void setDataInsercao(String dataInsercao)
	{
		this.dataInsercao = dataInsercao;
	}

	/** 
	 * Gets the value of dataInsercao
	 */
	public String getDataInsercao()
	{
		return dataInsercao;
	}

	/** 
	 * Sets the value of genero
	 */
	public void setGenero(String genero)
	{
		this.genero = genero;
	}

	/** 
	 * Gets the value of genero
	 */
	public String getGenero()
	{
		return genero;
	}

	/** 
	 * Sets the value of crudMethod
	 */
	public void setCrudMethod(String crudMethod)
	{
		this.crudMethod = crudMethod;
	}

	/** 
	 * Gets the value of crudMethod
	 */
	public String getCrudMethod()
	{
		return crudMethod;
	}

	/**
	 * Method 'reset'
	 * 
	 */
	public void reset()
	{
		nome = "";
		morada = "";
		genero = "";
	}

	/**
	 * Method 'validate'
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
	{
		ActionErrors _errors = new ActionErrors();
		// attempt to parse idCliente
		try {
			long _parsed_idCliente = Long.parseLong( idCliente );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse numeroCc
		try {
			long _parsed_numeroCc = Long.parseLong( numeroCc );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse dataNascimento
		try {
			java.util.Date _parsed_dataNascimento = (dataNascimento == null || dataNascimento.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( dataNascimento);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse dataInsercao
		try {
			java.util.Date _parsed_dataInsercao = (dataInsercao == null || dataInsercao.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( dataInsercao);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}
