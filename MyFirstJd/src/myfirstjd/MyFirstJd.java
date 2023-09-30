/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstjd;

/**
 *
 * @author E-LAB-PC28
 */
import java.sql.*;
public class MyFirstJd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        try
        {
            String url = "jdbc:mysql://localhost:3306/db";
            String uname = "root";
            String pass = "root";
            String query = "select name,age from Batch14 where gender = \"M\"";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
//            System.out.println(con);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            System.out.println("name");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
