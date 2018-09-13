/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jedis.controllers;

import com.java.servicios.comunes.impl.JediDaoImpl;
import com.java.servicios.comunes.impl.SableDaoImpl;
import com.jedis.bean.Jedi;
import com.jedis.bean.Sable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author rafaelm
 */
@ManagedBean(name = "controller")
public class Controlador {
    private static boolean resultado;
    public List jedis = new ArrayList();
    
    public static String guardarJedi(Jedi jedi){
        
        JediDaoImpl instacia = JediDaoImpl.getINSTANCIA();
        resultado = instacia.insert(jedi);
        
        return (resultado) ? "respuesta" : "index";
    }
    
    public static String guardarSable(Sable sable){
        
        SableDaoImpl instacia = SableDaoImpl.getINSTANCIA();
        resultado = instacia.insert(sable);
        
        return (resultado) ? "respuesta" : "index";
    }
    
    public List leerListaJedi(){
        JediDaoImpl instancia = JediDaoImpl.getINSTANCIA();
        jedis = instancia.read();
        
        return jedis;
    } 
}
