package com.bonecos.kusco.struts.forms;

import java.math.*;
import java.text.*;
//import org.apache.struts.action.*;
//import javax.servlet.http.HttpServletRequest;
import com.bonecos.kusco.dto.*;

public class ClientesbonecosFindByPrimaryKeyForm //extends ActionForm
{
	protected String idCliente;

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
