/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import entidades.Producto;
import interfaces.Crudable;
import java.util.List;
import persistencia.ProductoDao;

/**
 *
 * @author Gabo
 */
public class ManejadorProducto implements Crudable<Producto> {

    @Override
    public Producto crear(Producto producto) {
        ProductoDao productoDao = new ProductoDao();
        return productoDao.crear(producto);
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
