package com.bonecos.kuscos.servlet;

import com.bonecos.kuscos.business.ClientesBonecos;

import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Registo extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //int id = Integer.parseInt(request.getParameter("id"));
        //CC
        int nCC = Integer.parseInt(request.getParameter("nCC"));
        //Primeiro Nome
        String first_name = request.getParameter("first_name");
        //Ultimo Nome
        String last_name = request.getParameter("last_name");
        //Morada
        String address = request.getParameter("address");
        //Datas
        String birthday = request.getParameter("birthday");
        String register = request.getParameter("register");

        //Genero
        String gender = request.getParameter("gender");
        //Leitura do Genero
        System.out.println("Gender is: " + gender);

        ClientesBonecos busClienteBonecos = new ClientesBonecos();

        com.bonecos.kuscos.dto.Clientesbonecos clientesbonecosDto = new com.bonecos.kuscos.dto.Clientesbonecos();

        //clientesbonecosDto.setIdCliente(id);
        //Numero CC
        clientesbonecosDto.setNumeroCc(nCC);
        //Nome
        clientesbonecosDto.setNome(first_name + " " + last_name);
        //Morada
        clientesbonecosDto.setMorada(address);
        //Datas
        try {
			clientesbonecosDto.setDataInsercao(new SimpleDateFormat("yyyy-mm-dd").parse(newFormatDate(register)));
			clientesbonecosDto.setDataNascimento(new SimpleDateFormat("yyyy-mm-dd").parse(newFormatDate(birthday)));
		} catch (ParseException e) {
			// TODO: handle exception
		}

        //Genero
        clientesbonecosDto.setGenero(gender);

        busClienteBonecos.insertCliente(clientesbonecosDto);
        
        out.close();
        
        PrintWriter out2 = response.getWriter(); 

        out2.println("<html><body><b>Successfully Inserted"

                    + "</b></body></html>");
    }
    
    public String newFormatDate(String date) {
    	String year = date.substring(6, 10);
    	String month = date.substring(3, 5);
    	String day = date.substring(0, 2);
    	
    	return day + "-" + month + "-" + year;
    }
   
}


