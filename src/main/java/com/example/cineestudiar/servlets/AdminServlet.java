package com.example.cineestudiar.servlets;

import com.example.cineestudiar.beans.BUser;
import com.example.cineestudiar.daos.AdminDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "AdminServlet", urlPatterns = {"/AdminServlet",""})
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try(PrintWriter printWriter = response.getWriter()) {
            printWriter.println("Hola Mundo");
        }
        ArrayList<BUser> listaOperadores = AdminDao.obtenerOperadores();
        request.setAttribute("listaOperadores",listaOperadores);
        RequestDispatcher view = request.getRequestDispatcher("listaOperadores.jsp");
        view.forward(request,response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
