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

public class ClientesbonecosSaveAction extends Action
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
			// cast the form to the appropriate type
			ClientesbonecosForm clientesbonecosForm = (ClientesbonecosForm) form;
		
			// create the DAO class
			ClientesbonecosDao dao = ClientesbonecosDaoFactory.create();
		
			Clientesbonecos dto = new Clientesbonecos();
			dto.setIdCliente( Long.parseLong( clientesbonecosForm.getIdCliente() ));
			dto.setNumeroCc( Long.parseLong( clientesbonecosForm.getNumeroCc() ));
			dto.setNome( clientesbonecosForm.getNome());
			dto.setMorada( clientesbonecosForm.getMorada());
			dto.setDataNascimento( (clientesbonecosForm.getDataNascimento() == null || clientesbonecosForm.getDataNascimento().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( clientesbonecosForm.getDataNascimento()));
			dto.setDataInsercao( (clientesbonecosForm.getDataInsercao() == null || clientesbonecosForm.getDataInsercao().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( clientesbonecosForm.getDataInsercao()));
			dto.setGenero( clientesbonecosForm.getGenero());
		
			if (clientesbonecosForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (clientesbonecosForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (clientesbonecosForm.getCrudMethod().equalsIgnoreCase("delete")) {
				dao.delete( dto.createPk() );
			}
		
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
