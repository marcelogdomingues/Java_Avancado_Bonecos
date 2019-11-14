package com.bonecos.kusco.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.bonecos.kusco.dto.*;

public class ClientesbonecosFindWhereMoradaEqualsForm extends ActionForm
{
	protected String morada;

	protected String crudMethod;

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

}
