/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.servicios.comunes.impl;

import com.conexion.Conexion;
import com.java.servicios.comunes.IDaoComun;
import com.jedis.bean.Jedi;
import com.jedis.bean.Sable;
import java.sql.*;
import java.util.*;

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
    
    private Connection con;
    private Statement stm;
    private Jedi jedi ;
    private Sable sable;
    private List jedis;
    private ResultSet rs;
    
    
    public boolean dml(String query){
        try {
             con = Conexion.getConnection();
             stm = con.createStatement();
            int resultado = stm.executeUpdate(query);
            if(resultado == 1)
                return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            Conexion.close(stm);
            Conexion.close(con);
        }
        return false;
    } 
    
    @Override
    public boolean insert(Object objeto) {
            jedi = (Jedi) objeto;
            String query = "INSERT INTO jedi (nombre) "
                    + "VALUES ( ' "+ jedi.getNombre() + " ' ) ";
        return dml(query);
    }

    @Override
    public List read() {
     String queryRead = "SELECT jedi.rango, jedi.nombre , jedi.apellido , sable.tipoSable "
             + "FROM jedi INNER JOIN "
             + "sable ON jedi.sable_idsable = idsable";
        try {
            con = Conexion.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(queryRead);
            
            jedis = new ArrayList<Jedi>();
            
            while(rs.next()){
                
                jedi = new Jedi();
                sable = new Sable();
                
                jedi.setNombre(rs.getString("nombre"));
                jedi.setApellido(rs.getString("apellido"));
                jedi.setRango(rs.getString("rango"));
                sable.setTipoSable(rs.getString("tipoSable"));
                
                jedi.setTipoSable(sable);
                jedis.add(jedi);
                
            }
            
        } catch (SQLException ex) {
            Conexion.close(stm);
            Conexion.close(rs);
            Conexion.close(con);
        }
     
     return jedis;

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
