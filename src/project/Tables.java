/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tanma
 */
public class Tables {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table user (name varchar(200), email varchar(200), password varchar(200), securityQuestion varchar(500), answer varchar(200), age varchar(200));");
            JOptionPane.showMessageDialog(null, "Table Created.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally{
            try {
                con.close();
                st.close();
            }
            catch(Exception e){
                
            }
        }
    }
}
