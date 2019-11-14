package com.bonecos.kusco.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.bonecos.kusco.dto.*;

public class ClientesbonecosFindWhereDataInsercaoEqualsForm extends ActionForm
{
	protected String dataInsercao;

	protected String crudMethod;

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
