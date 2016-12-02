package com.catalogue.repository;

import com.catalogue.core.entity.Client;

import java.sql.*;

public class JdbcClientDAO {

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
            ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENT");

            /*while (rs.next()){
                String zip = rs.getString("LASTNAME");
                System.out.println(zip);
            }*/

        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
    }

    public void Insert(Client client)
    {
        try {

            if (this.con.isClosed())
                return;

            PreparedStatement statement = this.con.prepareStatement("INSERT INTO CLIENT VALUES (?,?,?,?,?,?,?,?)");
            statement.setInt(1, client.getId());
            statement.setString(2, client.getLastname());
            statement.setString(3, client.getFirstname());
            statement.setString(4, client.getAddress());
            statement.setString(5, client.getPhone());
            statement.setString(6, client.getEmail());
            statement.setInt(7, client.getCourseSessionId());
            statement.execute();

        } catch (Throwable e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
    }

}