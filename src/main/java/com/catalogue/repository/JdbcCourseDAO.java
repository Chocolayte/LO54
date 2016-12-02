package com.catalogue.repository;

import com.catalogue.core.entity.Course;

import java.sql.*;

public class JdbcCourseDAO {

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
            ResultSet rs = stmt.executeQuery("SELECT * FROM COURSE");

        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
    }

    public void Insert(Course course)
    {
        try {

            if (this.con.isClosed())
                return;

            PreparedStatement statement = this.con.prepareStatement("INSERT INTO COURSE VALUES (?,?)");
            statement.setString(1, course.getCode());
            statement.setString(2, course.getTitle());
            statement.execute();

        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
    }
}
