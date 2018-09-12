/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.servicios.genericos;

import java.sql.ResultSet;

/**
 *
 * @author rafaelm
 */
public interface IDaoGeneric<T> {
    boolean insert(T objeto );
    ResultSet read();
    boolean update(T objeto);
    boolean delete(int id);
    
    
}
