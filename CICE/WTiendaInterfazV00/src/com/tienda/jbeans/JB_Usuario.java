/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.jbeans;

/**
 *
 * @author cice
 */
public class JB_Usuario {
    
    private int idUsuario;
    private String usuario;
    private String password;
    private String email;
    private int idCliente;

    public JB_Usuario(){}
    
    public JB_Usuario(int idUsuario, String usuario, String password, String email, int idCliente){
    
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
        this.email = email;
        this.idCliente = idCliente;
        
    }
    
    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
