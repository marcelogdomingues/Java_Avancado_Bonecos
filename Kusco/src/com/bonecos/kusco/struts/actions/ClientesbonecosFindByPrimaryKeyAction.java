package com.bonecos.kusco.struts.actions;

//import org.apache.struts.*;
//import org.apache.struts.action.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.math.*;
import com.bonecos.kusco.dao.*;
import com.bonecos.kusco.dto.*;
import com.bonecos.kusco.factory.*;
import com.bonecos.kusco.struts.forms.*;

public class ClientesbonecosFindByPrimaryKeyAction //extends Action
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
//	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
//	{
//		try {
//			// parse parameters
//			long _idCliente = Long.parseLong( request.getParameter("idCliente") );
//		
//			// create the DAO class
//			ClientesbonecosDao dao = ClientesbonecosDaoFactory.create();
//		
//			// execute the finder
//			Clientesbonecos dto = dao.findByPrimaryKey(_idCliente);
//		
//			// check that we have found a row
//			if (dto == null) {
//				throw new RuntimeException( "Finder did not return any data" );
//			}
//		
//			String crudMethod = request.getParameter("crudMethod");
//			if (crudMethod == null) {
//				crudMethod = "view";
//			}
//		
//			// populate a struts form
//			ClientesbonecosForm clientesbonecosForm = new ClientesbonecosForm();
//			clientesbonecosForm.setCrudMethod( request.getParameter("crudMethod") );
//			clientesbonecosForm.setIdCliente(String.valueOf( dto.getIdCliente() ));
//			clientesbonecosForm.setNumeroCc(String.valueOf( dto.getNumeroCc() ));
//			clientesbonecosForm.setNome(dto.getNome());
//			clientesbonecosForm.setMorada(dto.getMorada());
//			clientesbonecosForm.setDataNascimento(dto.getDataNascimento() == null ? null : DateFormat.getDateTimeInstance().format( dto.getDataNascimento()));
//			clientesbonecosForm.setDataInsercao(dto.getDataInsercao() == null ? null : DateFormat.getDateTimeInstance().format( dto.getDataInsercao()));
//			clientesbonecosForm.setGenero(dto.getGenero());
//			// store the results
//			request.getSession().setAttribute( "Clientesbonecos", clientesbonecosForm );
//		
//			return mapping.findForward( crudMethod );
//		}
//		catch (Exception e) {
//			ActionErrors _errors = new ActionErrors();
//			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
//			saveErrors( request, _errors );
//			return mapping.findForward( "failure" );
//		}
//		
//	}

}
