/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jedis.bean;

import com.jedis.controllers.Controlador;
import javax.faces.bean.ManagedBean;



/**
 *
 * @author rafaelm
 */
@ManagedBean(name = "sable")
public class Sable implements MetodosBean{
    
    private int idSable;
    private String tipoSable;

    public Sable() {
    }

    public int getIdSable() {
        return idSable;
    }

    public String getTipoSable() {
        return tipoSable;
    }

    public void setIdSable(int idSable) {
        this.idSable = idSable;
    }

    public void setTipoSable(String tipoSable) {
        this.tipoSable = tipoSable;
    }

    @Override
    public String insert() {
        return Controlador.guardarSable(this);
    }
    
    
}
