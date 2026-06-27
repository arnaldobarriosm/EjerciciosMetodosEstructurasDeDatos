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
public class NodoCircularDoble<E> {

    private NodoCircularDoble<E> anterior;
    private E elemento;
    private NodoCircularDoble<E> siguiente;

    public NodoCircularDoble() {
        this.anterior = this;
        this.elemento = null;
        this.siguiente = this;
    }

    public NodoCircularDoble(E elemento) {
        this.anterior = this;
        this.elemento = elemento;
        this.siguiente = this;
    }

    public NodoCircularDoble(NodoCircularDoble<E> anterior, E elemento, NodoCircularDoble<E> siguiente) {
        this.anterior = anterior;
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoCircularDoble<E> getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoCircularDoble<E> anterior) {
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
    public NodoCircularDoble<E> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircularDoble<E> siguiente) {
        this.siguiente = siguiente;
    }
}
