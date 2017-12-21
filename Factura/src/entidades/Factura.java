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
public class Factura {
    private int id;
    private String fecha;
    private Cliente cliente;

    public Factura(String fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Factura(int id, String fecha, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Factura(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
