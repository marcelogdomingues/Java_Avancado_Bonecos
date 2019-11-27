package com.bonecos.kuscos.servlet;

import com.bonecos.kuscos.business.ClientesBonecos;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Registo extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //Primeiro Nome
        String n = request.getParameter("first_name");
        //Ultimo Nome
        String p = request.getParameter("last_name");
        //Falta Datas

        //Morada
        String e = request.getParameter("adress");
        //CC
        int c = Integer.parseInt(request.getParameter("nCC"));
        ClientesBonecos busClienteBonecos = new ClientesBonecos();

        com.bonecos.kuscos.dto.Clientesbonecos clientesbonecosDto = new com.bonecos.kuscos.dto.Clientesbonecos();

        clientesbonecosDto.setNome(n + " " + p);
        clientesbonecosDto.setMorada(e);
        clientesbonecosDto.setNumeroCc(c);

        busClienteBonecos.insertCliente(clientesbonecosDto);

        out.close();
    }
    }


