/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.servicios.comunes;

import java.sql.ResultSet;

/**
 *
 * @author rafaelm
 */
public interface IDaoComun {
    boolean insert(Object objeto );
    ResultSet read();
    boolean update(Object objeto);
    boolean delete(int id);
}
