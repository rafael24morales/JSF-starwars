/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.servicios.comunes.impl;

import com.conexion.Conexion;
import com.java.servicios.comunes.IDaoComun;
import com.jedis.bean.Jedi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafaelm
 */
public class JediDaoImpl implements IDaoComun{
    

    @Override
    public boolean insert(Object objeto) {
            Jedi jedi = (Jedi) objeto;
        try {
            Connection con = Conexion.getConnection();
            String queryInsert = "INSERT INTO jedi (nombre) "
                    + "VALUES ( ' "+ jedi.getNombre() + " ' ) ";
            Statement stm = con.createStatement();
            stm.executeUpdate(queryInsert);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ResultSet read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
