/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuente;

/**
 *
 * @author Wendy Soto
 */
public class MayorMenor {
     public int numero_mayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;
        } else {
            return b;
        }
    }
    
}
