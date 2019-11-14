package com.bonecos.kusco.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.bonecos.kusco.dto.*;

public class ClientesbonecosFindWhereNumeroCcEqualsForm extends ActionForm
{
	protected String numeroCc;

	protected String crudMethod;

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
