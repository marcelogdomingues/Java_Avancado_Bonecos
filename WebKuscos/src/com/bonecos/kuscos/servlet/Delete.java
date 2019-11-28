package com.bonecos.kuscos.servlet;

import com.bonecos.kuscos.business.ClientesBonecos;

import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Delete extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));

        ClientesBonecos busClienteBonecos = new ClientesBonecos();

        com.bonecos.kuscos.dto.Clientesbonecos clientesbonecosDto = new com.bonecos.kuscos.dto.Clientesbonecos();

        clientesbonecosDto.setIdCliente(id);


        busClienteBonecos.deleteCliente(clientesbonecosDto);

        out.close();
    }
    
   
}


