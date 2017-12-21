/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author Gabo
 * @param <T>
 */
public interface Crudable<T> {
    T crear(T objeto);
    T modificar(T objeto);
    T listarUno();
    Boolean eliminar(T objeto);
    List<T> listar();
    
}
