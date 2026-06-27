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
public class NodoCircular<E> {

    private E elemento;
    private NodoCircular<E> siguiente;

    public NodoCircular() {
        this.elemento = null;
        this.siguiente = this;
    }

    public NodoCircular(E elemento) {
        this.elemento = elemento;
        this.siguiente = this;
    }

    public NodoCircular(NodoCircular<E> anterior, E elemento, NodoCircular<E> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    /**
     * @return the elemento
     */
    public E getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public NodoCircular<E> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircular<E> siguiente) {
        this.siguiente = siguiente;
    }
}
