/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import entidades.Cliente;
import interfaces.Crudable;
import java.util.List;
import persistencia.ClienteDao;

/**
 *
 * @author Gabo
 */
public class ManejadorCliente implements Crudable<Cliente> {

    @Override
    public Cliente crear(Cliente cliente) {
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.crear(cliente);
    }

    @Override
    public Cliente modificar(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
