package com.catalogue.repository;

import com.catalogue.core.entity.Course;
import com.catalogue.core.entity.Location;

import java.sql.*;

public class JdbcLocationDAO {

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
            ResultSet rs = stmt.executeQuery("SELECT * FROM LOCATION");

        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
    }

    public void Insert(Location location)
    {
        try {

            if (this.con.isClosed())
                return;

            PreparedStatement statement = this.con.prepareStatement("INSERT INTO LOCATION VALUES (?,?)");
            statement.setInt(1, location.getId());
            statement.setString(2, location.getCity());
            statement.execute();

        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
    }
}
