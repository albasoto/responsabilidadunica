/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import conexion.Conexion;
import entidades.Cliente;
import entidades.Detalle;
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
public class DetalleDao implements Crudable<Detalle>{

    @Override
    public Detalle crear(Detalle detalle) {
        try {
            Conexion conexion = new Conexion();
            Connection miConexion  = conexion.obtener();
            PreparedStatement consulta;

            consulta = miConexion.prepareStatement("INSERT INTO detalle (factura, producto, cantidad,subtotal, iva, total) VALUES(?, ?, ?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, detalle.getFactura().getId());
            consulta.setInt(2, detalle.getProducto().getId());
            consulta.setDouble(3, detalle.getCantidad());
            consulta.setDouble(4, detalle.getSubTotal());
            consulta.setDouble(5, detalle.getIva());
            consulta.setDouble(6, detalle.getTotal());
   
         
            
            int filasInsertadas = consulta.executeUpdate();
            
            if (filasInsertadas==0) {
                 throw new SQLException("Creating user failed, no rows affected.");
            }
            try (ResultSet generatedKeys = consulta.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                
                Detalle detalleIngresado = new Detalle(generatedKeys.getInt(1));
           
                
                 return detalleIngresado;
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
    public Detalle modificar(Detalle objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Detalle objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detalle> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
