/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import ticketbooking.DBConnection;

/**
 *
 * @author user
 */
public class addTicket {
    
    java.sql.Statement stmt;
    
        public void add_Ticket (String seat_type, double price, int qty, double total){
        try{
            
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate
        ("INSERT INTO ticket VALUES ('"+seat_type+"','"+price+"','"+qty+"','"+total+"')");
    }
        catch (Exception e){
            e.printStackTrace();
        }
}
}
