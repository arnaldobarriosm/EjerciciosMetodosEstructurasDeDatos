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
public interface Cola<E> {

    boolean estaVacia();

    boolean estaLlena();

    int tamanio();

    void agregar(E elemento);

    E remover();

    E primero();

    E ultimo();

    //Método para limpiar la cola.
    void limpiar();
}

