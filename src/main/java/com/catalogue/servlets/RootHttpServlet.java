package com.catalogue.servlets;

import com.catalogue.core.entity.Course;
import com.catalogue.repository.JdbcClientDAO;
import com.catalogue.repository.JdbcCourseDAO;

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

        Course course = new Course();
        course.setCode("X");
        course.setTitle("Grand tour 2009");

        JdbcCourseDAO dbCourse = new JdbcCourseDAO();
        dbCourse.persist(course);

        response.setContentType("text/html");
        response.setCharacterEncoding( "UTF-8" );
        request.setAttribute("test", "i");

        request.getRequestDispatcher("/WEB-INF/root.jsp").forward(request, response);
    }

}
