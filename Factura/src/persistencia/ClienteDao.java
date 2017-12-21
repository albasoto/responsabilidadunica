/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import conexion.Conexion;
import entidades.Cliente;
import interfaces.Crudable;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabo
 */
public class ClienteDao implements Crudable<Cliente>{

    @Override
    public Cliente crear(Cliente cliente) {
        try {
            Conexion conexion = new Conexion();
            Connection miConexion  = conexion.obtener();
            PreparedStatement consulta;

            consulta = miConexion.prepareStatement("INSERT INTO cliente (cedula, nombre, direccion,telefono) VALUES(?, ?, ?,?)", Statement.RETURN_GENERATED_KEYS);
            consulta.setString(1, cliente.getCedula());
            consulta.setString(2, cliente.getNombre());
            consulta.setString(3, cliente.getDireccion());
            consulta.setString(4, cliente.getTelefono());
         
            
            int filasInsertadas = consulta.executeUpdate();
            
            if (filasInsertadas==0) {
                 throw new SQLException("Creating user failed, no rows affected.");
            }
            try (ResultSet generatedKeys = consulta.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                
                Cliente clienteIngresado = new Cliente(generatedKeys.getInt(1));
           
                
                 return clienteIngresado;
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
    public Cliente modificar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
