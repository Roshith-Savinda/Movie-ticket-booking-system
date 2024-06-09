/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbooking;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ticketController {
        public static void addTicket (String seat_type, double price, int qty, double total){
        
        new Model.addTicket().add_Ticket(seat_type, price, qty, total);
        
        JOptionPane.showMessageDialog(null, "Ticket details has been inserted","Successfull",JOptionPane.INFORMATION_MESSAGE);
    }
}
