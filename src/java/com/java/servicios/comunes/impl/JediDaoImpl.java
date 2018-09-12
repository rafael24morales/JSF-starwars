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
    
    
    private JediDaoImpl(){}
    
    private static final JediDaoImpl INSTANCIA = new JediDaoImpl();

    public static JediDaoImpl getINSTANCIA() {
        return INSTANCIA;
    }
    
    
    

    @Override
    public boolean insert(Object objeto) {
            Jedi jedi = (Jedi) objeto;
            String queryInsert = "INSERT INTO jedi (nombre) "
                    + "VALUES ( ' "+ jedi.getNombre() + " ' ) ";
        try {
            Connection con = Conexion.getConnection();
            Statement stm = con.createStatement();
            int resultado = stm.executeUpdate(queryInsert);
            if(resultado == 1)
                return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
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
