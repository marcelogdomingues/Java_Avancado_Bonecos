package com.bonecos.kusco.struts.actions;

import org.apache.struts.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import com.bonecos.kusco.dao.*;
import com.bonecos.kusco.dto.*;
import com.bonecos.kusco.factory.*;
import com.bonecos.kusco.struts.forms.*;

public class ClientesbonecosUpdateAction extends Action
{
	/**
	 * Method 'execute'
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @throws Exception
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// cast the form to the appropriate type
		ClientesbonecosForm clientesbonecosForm = (ClientesbonecosForm) form;
		
		clientesbonecosForm.reset();
		clientesbonecosForm.setCrudMethod( "update" );
		return mapping.findForward( "success" );
	}

}
