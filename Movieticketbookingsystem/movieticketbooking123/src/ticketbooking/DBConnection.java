/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbooking;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nihal SG
 */
public class DBConnection {
    

    static java.sql.Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection(){
        
        try{
            String url = "jdbc:mysql://localhost:3306/ticketbooking";
            conn = DriverManager.getConnection(url,"root","");
            
            stat = conn.createStatement();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return stat;
    }

    /**
     *
     */
    public static void closeCon() throws SQLException{
        conn.close();
    }
    
    
    
public static java.sql.Connection getConnection() {
java.sql.Connection connection = null;

try {
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbooking", "root", "");
} catch (ClassNotFoundException | SQLException e) {
System.out.println("Error Occured While Getting the Connection: - " + e);
}
return connection;
}
    
}
