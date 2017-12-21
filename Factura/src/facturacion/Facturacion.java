/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import entidades.Cliente;
import entidades.Detalle;
import entidades.Factura;
import entidades.Producto;
import manejadores.ManejadorCliente;
import manejadores.ManejadorDetalle;
import manejadores.ManejadorFactura;
import manejadores.ManejadorProducto;
import vista.index;

/**
 *
 * @author Gabo
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        ManejadorFactura manejadorFactura = new ManejadorFactura();
        ManejadorProducto manejadorProducto = new ManejadorProducto();
        ManejadorDetalle manejadorDetalle = new ManejadorDetalle();
        
        Cliente cliente = new Cliente("1723713556", "Gabo", "Quito sur", "2621561");
        Cliente clienteIngresado = manejadorCliente.crear(cliente);
        
        Factura factura = new Factura("12/10/2014", clienteIngresado);
        Factura facturaCreada = manejadorFactura.crear(factura);
        
        Producto producto1  = new Producto("Atun real de 80gr", 250);
        Producto producto2 = new Producto("Atun real de 160gr", 250);
       
        
        Producto productoCreado1 = manejadorProducto.crear(producto1);
        Producto productoCreado2 = manejadorProducto.crear(producto2);
       
        
        Detalle detalle1 = new Detalle(facturaCreada, productoCreado1, 0, 0, 0, 0);
        Detalle detalle2 = new Detalle(facturaCreada, productoCreado2, 0, 0, 0, 0);
        
        manejadorDetalle.crear(detalle1);
        manejadorDetalle.crear(detalle2);
        
        
        
        
        
    }
    
}
