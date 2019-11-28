package com.bonecos.kuscos.servlet;

import com.bonecos.kuscos.business.ClientesBonecos;
import com.bonecos.kuscos.dto.Clientesbonecos;

import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Listagem extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        ClientesBonecos busClienteBonecos = new ClientesBonecos();
        String Cli = request.getParameter("listaclientes");
        Clientesbonecos[] listCli = busClienteBonecos.getListaClientes();
        Clientesbonecos cliente = new Clientesbonecos();

        request.setAttribute("listaclientes", listCli);
        request.setAttribute("cliente", cliente);

        out.close();
    }

}


