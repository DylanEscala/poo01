/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author dylan
 */
public interface Transaccionable {
    void consultarEstado(String usuario);
    void desactivar(String usuario,String numero);
}

