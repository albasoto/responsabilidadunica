/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import entidades.Factura;
import interfaces.Crudable;
import java.util.List;
import persistencia.FacturaDao;

/**
 *
 * @author Gabo
 */
public class ManejadorFactura implements Crudable<Factura>{

    @Override
    public Factura crear(Factura factura) {
       FacturaDao facturaDao = new FacturaDao();
       return facturaDao.crear(factura);
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
