/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jedis.bean;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author rafaelmc
 */

@ManagedBean(name="jedi")
public class Jedi {
    
    private int idJedi;
    private String nombre;
    private String apellido;
    private String rango;
    private Sable tipoSable;
    
    
    public Jedi() {
    }

    public int getIdJedi() {
        return idJedi;
    }

    public Sable getTipoSable() {
        return tipoSable;
    }

    private void setIdJedi(int idJedi) {
        this.idJedi = idJedi;
    }

    public void setTipoSable(Sable tipoSable) {
        this.tipoSable = tipoSable;
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    
    
    
    
}
