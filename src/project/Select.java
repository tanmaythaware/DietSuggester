/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tanma
 */
public class Select {
    public static ResultSet getData(String query){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
