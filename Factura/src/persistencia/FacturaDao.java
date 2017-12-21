/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import conexion.Conexion;
import entidades.Factura;
import interfaces.Crudable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabo
 */
public class FacturaDao implements Crudable<Factura>{

    @Override
    public Factura crear(Factura factura) {
        try {
            Conexion conexion = new Conexion();
            Connection miConexion  = conexion.obtener();
            PreparedStatement consulta;

            consulta = miConexion.prepareStatement("INSERT INTO factura (fecha, cliente) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            consulta.setString(1, factura.getFecha());
            consulta.setInt(2, factura.getCliente().getId());
         
            
            int filasInsertadas = consulta.executeUpdate();
            
            if (filasInsertadas==0) {
                 throw new SQLException("Creating user failed, no rows affected.");
            }
            try (ResultSet generatedKeys = consulta.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                
                Factura facturaIngresada = new Factura(generatedKeys.getInt(1));
           
                
                 return facturaIngresada;
            }
            else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
            
            
       
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
    }

    @Override
    public Factura modificar(Factura objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Factura objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Factura> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
