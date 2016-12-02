package com.catalogue.repository;


import com.catalogue.core.entity.CourseSession;

import java.sql.*;

public class JdbcCourseSessionDAO {

    Connection con = null;

    public void Connect()
    {
        this.con = null;

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            this.con = DriverManager.getConnection("jdbc:derby://localhost:1527/centerDb;create=true;user=root;password=root");
            System.out.println("CONNEXION OK");
        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        } finally{
            try {
                if (this.con != null)
                    this.con.close();
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void Select()
    {
        try {
            if (this.con.isClosed())
                return;

            Statement stmt = this.con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM COURSE_SESSION");

        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
    }

    public void Insert(CourseSession courseSession)
    {
        try {

            if (this.con.isClosed())
                return;

            PreparedStatement statement = this.con.prepareStatement("INSERT INTO COURSE_SESSION VALUES (?,?,?,?,?)");
            statement.setInt(1, courseSession.getId());
            statement.setDate(2, courseSession.getStartDate());
            statement.setDate(3, courseSession.getEndDate());
            statement.setString(4, courseSession.getCourseCode());
            statement.setInt(5, courseSession.getLocationId());
            statement.execute();

        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
    }
}
