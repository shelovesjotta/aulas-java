/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u71661414176
 */
public class TesteJDBC {
    public static void main(String[] args) {
        String url, user, password;
        url = "jdbc:mysql://10.7.0.51:33062/db_claudio_elizeche";
        user = "claudio_elizeche";
        password = "claudio_elizeche";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm;
            stm = cnt.createStatement();
            String sql = "";
            stm.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            System.out.println("eroo na conexao");
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("conectou");
    }
}
