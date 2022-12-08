/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.jbeans;

/**
 *
 * @author Charlie
 */
public class JB_SubCategoria {

    private int idSubCategoria;
    private int idCategoria;
    private String subCategoria;

    public JB_SubCategoria() {
    }

    public JB_SubCategoria(int idSubCategoria, int idCategoria, String subCategoria) {
        this.idSubCategoria = idSubCategoria;
        this.idCategoria = idCategoria;
        this.subCategoria = subCategoria;
    }

    /**
     * @return the idSubCategoria
     */
    public int getIdSubCategoria() {
        return idSubCategoria;
    }

    /**
     * @param idSubCategoria the idSubCategoria to set
     */
    public void setIdSubCategoria(int idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the subCategoria
     */
    public String getSubCategoria() {
        return subCategoria;
    }

    /**
     * @param subCategoria the subCategoria to set
     */
    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }
}
