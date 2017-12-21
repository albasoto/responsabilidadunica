/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Gabo
 */
public class Detalle {
    private int id;
    private Factura factura;
    private Producto producto;
    private double cantidad, subTotal, iva, total;

    public Detalle(Factura factura, Producto producto, double cantidad, double subTotal, double iva, double total) {
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.iva = iva;
        this.total = total;
    }

    public Detalle(int id) {
        this.id = id;
    
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
