/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jedis.controllers;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author rafaelm
 */
@ManagedBean(name = "serv")
public class Controlador {
    
    public static String guardar(){
        return "respuesta";
    }
    
}
