/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Usuarios;
import aulas.TesteJDBC;
import java.sql.PreparedStatement;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u71661414176
 */
public class Usuarios_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Usuarios usuarios = (Usuarios) object;
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
            String sql = "insert into Usuario values (?,?,?,?,?,?,?,?)";
            //stm.executeUpdate(sql);
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, usuarios.getIdUsuarios());
            pstm.setString(2, usuarios.getNome());
            pstm.setString(3, usuarios.getApelido());
            pstm.setString(4, usuarios.getCpf());
            pstm.setDate(5, new Date(2001,1,1));
            pstm.setString(6, usuarios.getSenha());
            pstm.setInt(7, usuarios.getNivel());
            pstm.setString(8, usuarios.getAtivo());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            System.out.println("erro na conexao");
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listaAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
       Usuarios usuarios = new Usuarios();
       usuarios.setIdUsuarios(6);
       usuarios.setNome("claudio");
       usuarios.setApelido("jotta");
       usuarios.setCpf("123456");
       //usuarios.setDatanascimento("");
       usuarios.setSenha("123");
       usuarios.setNivel(1);
       usuarios.setAtivo("S");
       
       Usuarios_DAO usuarios_DAO = new Usuarios_DAO();
       usuarios_DAO.insert(usuarios);
        System.out.println("Deu certo");
       
       
    }

    
}
