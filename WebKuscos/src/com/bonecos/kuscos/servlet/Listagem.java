package com.bonecos.kuscos.servlet;

import com.bonecos.kuscos.business.ClientesBonecos;

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

        busClienteBonecos.getListaClientes();

        out.close();
    }

}


