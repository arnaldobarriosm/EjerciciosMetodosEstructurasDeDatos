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
public class NodoDoble<E> {

    private NodoDoble<E> anterior;
    private E elemento;
    private NodoDoble<E> siguiente;

    public NodoDoble() {
        this.anterior = null;
        this.elemento = null;
        this.siguiente = null;
    }

    public NodoDoble(E elemento) {
        this.anterior = null;
        this.elemento = elemento;
        this.siguiente = null;
    }

    public NodoDoble(NodoDoble<E> anterior, E elemento, NodoDoble<E> siguiente) {
        this.anterior = anterior;
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public boolean tieneAnterior() {
        return anterior != null;
    }

    public boolean tieneSiguiente() {
        return siguiente != null;
    }

    /**
     * @return the anterior
     */
    public NodoDoble<E> getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDoble<E> anterior) {
        this.anterior = anterior;
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
    public NodoDoble<E> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDoble<E> siguiente) {
        this.siguiente = siguiente;
    }
}
