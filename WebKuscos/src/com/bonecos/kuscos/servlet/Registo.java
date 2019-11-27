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

        //CC
        int nCC = Integer.parseInt(request.getParameter("nCC"));
        //Primeiro Nome
        String first_name = request.getParameter("first_name");
        //Ultimo Nome
        String last_name = request.getParameter("last_name");
        //Morada
        String adress = request.getParameter("adress");

        //Falta Datas

        //Genero
        String gender = request.getParameter("gender");
        //Leitura do Genero
        System.out.println("Gender is: " + gender);

        ClientesBonecos busClienteBonecos = new ClientesBonecos();

        com.bonecos.kuscos.dto.Clientesbonecos clientesbonecosDto = new com.bonecos.kuscos.dto.Clientesbonecos();

        //Numero CC
        clientesbonecosDto.setNumeroCc(nCC);
        //Nome
        clientesbonecosDto.setNome(first_name + " " + last_name);
        //Morada
        clientesbonecosDto.setMorada(adress);
        //Morada

        //Genero
        clientesbonecosDto.setGenero(gender);

        busClienteBonecos.insertCliente(clientesbonecosDto);

        out.close();
    }
    }


