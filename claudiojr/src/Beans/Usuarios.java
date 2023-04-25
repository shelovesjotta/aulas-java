/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Date;

/**
 *
 * @author u71661414176
 */
public class Usuarios {

    public static void setIdusuarios(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int idUsuarios;
    private String nome;
    private String apelido;
    private String cpf;
    private Date datanascimento;
    private String senha;
    private int nivel;
    private String ativo;

    
    public Usuarios() {
    
    }
    /**
     * @return the idUsuarios
     */
    public int getIdUsuarios() {
        return idUsuarios;
    }

    /**
     * @param idUsuarios the idUsuarios to set
     */
    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the datanascimente
     */
    public Date getDatanascimente() {
        return datanascimente;
    }

    /**
     * @param datanascimente the datanascimente to set
     */
    public void setDatanascimente(Date datanascimente) {
        this.datanascimente = datanascimente;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public java.sql.Date getDatanascimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
