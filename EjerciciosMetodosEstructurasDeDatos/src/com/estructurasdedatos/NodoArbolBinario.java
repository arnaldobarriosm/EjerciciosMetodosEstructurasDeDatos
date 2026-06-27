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
public class NodoArbolBinario<E> {

    private NodoArbolBinario<E> hijoIzquierdo;
    private E elemento;
    private NodoArbolBinario<E> hijoDerecho;

    public NodoArbolBinario() {
        this.hijoIzquierdo = null;
        this.elemento = null;
        this.hijoDerecho = null;
    }

    public NodoArbolBinario(E elemento) {
        this.hijoIzquierdo = null;
        this.elemento = elemento;
        this.hijoDerecho = null;
    }

    public NodoArbolBinario(NodoArbolBinario<E> hijoIzquierdo, E elemento, NodoArbolBinario<E> hijoDerecho) {
        this.hijoIzquierdo = hijoIzquierdo;
        this.elemento = elemento;
        this.hijoDerecho = hijoDerecho;
    }

    public boolean tieneHijoIzquierdo() {
        return hijoIzquierdo != null;
    }

    public boolean tieneHijoDerecho() {
        return hijoDerecho != null;
    }

    public boolean tieneHijos(){
        return hijoIzquierdo != null || hijoDerecho != null;
    }

    public boolean esHoja(){
        return hijoIzquierdo == null && hijoDerecho == null;
    }

    /**
     * @return the anterior
     */
    public NodoArbolBinario<E> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    /**
     * @param hijoIzquierdo the anterior to set
     */
    public void setHijoIzquierdo(NodoArbolBinario<E> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
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
    public NodoArbolBinario<E> getHijoDerecho() {
        return hijoDerecho;
    }

    /**
     * @param hijoDerecho the siguiente to set
     */
    public void setHijoDerecho(NodoArbolBinario<E> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
}
