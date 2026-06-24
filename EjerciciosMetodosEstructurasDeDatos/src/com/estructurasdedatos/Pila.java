/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructurasdedatos;

/**
 *
 * @author abarrios
 * @param <E> elemento
 */
public interface Pila<E> {

    boolean estaVacia();

    boolean estaLlena();

    int tamanio();

    void agregar(E elemento);

    E remover();

    E cima();

    //Método para limpiar la pila.
    void limpiar();
}
