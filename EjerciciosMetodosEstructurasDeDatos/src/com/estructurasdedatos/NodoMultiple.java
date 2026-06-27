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
public class NodoMultiple<E> {

    private E elemento;
    private NodoMultiple<E> anterior;
    private NodoMultiple<E> siguiente;
    private NodoMultiple<E> superior;
    private NodoMultiple<E> inferior;

    public NodoMultiple() {
        this.elemento = null;
        this.anterior = null;
        this.siguiente = null;
        this.superior = null;
        this.inferior = null;
    }

    public NodoMultiple(E elemento) {
        this.elemento = elemento;
        this.anterior = null;
        this.siguiente = null;
        this.superior = null;
        this.inferior = null;
    }

    public NodoMultiple(E elemento, NodoMultiple<E> anterior, NodoMultiple<E> siguiente,  NodoMultiple<E> superior, NodoMultiple<E> inferior) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.superior = superior;
        this.inferior = inferior;
    }

    public boolean tieneAnterior() {
        return anterior != null;
    }

    public boolean tieneSiguiente() {
        return siguiente != null;
    }

    public boolean tieneSuperior() {
        return anterior != null;
    }

    public boolean tieneInferior() {
        return siguiente != null;
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
     * @return the anterior
     */
    public NodoMultiple<E> getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoMultiple<E> anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public NodoMultiple<E> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoMultiple<E> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @param superior the siguiente to set
     */
    public void setSuperior(NodoMultiple<E> superior) {
        this.superior = superior;
    }

    /**
     * @param inferior the siguiente to set
     */
    public void setInferior(NodoMultiple<E> inferior) {
        this.inferior = inferior;
    }
}
