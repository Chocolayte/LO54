package com.catalogue.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RootHttpServlet extends HttpServlet
{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding( "UTF-8" );
        request.setAttribute("test", "i");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<title>Root</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Root.</p>");
        out.println("</body>");
        out.println("</html>");

        request.getRequestDispatcher("/WEB-INF/root.jsp").forward(request, response);
    }

}