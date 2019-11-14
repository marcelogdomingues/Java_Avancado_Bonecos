package com.bonecos.kusco.struts.actions;

import org.apache.struts.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.math.*;
import com.bonecos.kusco.dao.*;
import com.bonecos.kusco.dto.*;
import com.bonecos.kusco.factory.*;
import com.bonecos.kusco.struts.forms.*;

public class ClientesbonecosFindWhereGeneroEqualsAction extends Action
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
		try {
			// parse parameters
			java.lang.String _genero = request.getParameter("genero");
		
			// create the DAO class
			ClientesbonecosDao dao = ClientesbonecosDaoFactory.create();
		
			// execute the finder
			Clientesbonecos dto[] = dao.findWhereGeneroEquals(_genero);
		
			// store the results
			request.setAttribute( "result", dto );
		
			return mapping.findForward( "success" );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}
