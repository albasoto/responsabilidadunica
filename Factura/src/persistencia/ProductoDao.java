/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import conexion.Conexion;
import entidades.Producto;
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
public class ProductoDao implements Crudable<Producto>{

    @Override
    public Producto crear(Producto producto) {
        try {
            Conexion conexion = new Conexion();
            Connection miConexion  = conexion.obtener();
            PreparedStatement consulta;

            consulta = miConexion.prepareStatement("INSERT INTO producto (nombre, stock) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            consulta.setString(1, producto.getNombre() );
            consulta.setDouble(2, producto.getStock());
         
            
            int filasInsertadas = consulta.executeUpdate();
            
            if (filasInsertadas==0) {
                 throw new SQLException("Creating user failed, no rows affected.");
            }
            try (ResultSet generatedKeys = consulta.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                
                Producto productoIngresado = new Producto(generatedKeys.getInt(1));
           
                System.out.println(productoIngresado.getId());
                 return productoIngresado;
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
    public Producto modificar(Producto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Producto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
