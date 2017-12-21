/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import entidades.Detalle;
import interfaces.Crudable;
import java.util.List;
import persistencia.DetalleDao;

/**
 *
 * @author Gabo
 */
public class ManejadorDetalle implements Crudable<Detalle> {

    @Override
    public Detalle crear(Detalle detalle) {
        DetalleDao detalleDao = new DetalleDao();
        return detalleDao.crear(detalle);
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
