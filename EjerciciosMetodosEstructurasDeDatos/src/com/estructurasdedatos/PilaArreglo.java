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
public class PilaArreglo<E> implements Pila<E> {

    private E[] listadoElementos;
    private int cima;
    private int maximo;
    private int tamanio;

    public PilaArreglo() {
        maximo = 100;
        listadoElementos = (E[]) new Object[this.maximo];
        cima = -1;
        tamanio = 0;
    }

    public PilaArreglo(int capacidadInicial) {
        maximo = capacidadInicial;
        listadoElementos = (E[]) new Object[maximo];
        cima = -1;
        tamanio = 0;
    }

    @Override
    public boolean estaVacia() {
        return cima == -1;
    }

    @Override
    public boolean estaLlena() {
        return cima == maximo - 1;
    }

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public void agregar(E elemento) {
        if (!estaLlena()) {
            listadoElementos[cima] = elemento;
            cima++;
            tamanio++;
        } else {
            System.out.println("Pila Llena...!!!");
        }
    }

    @Override
    public E remover() {
        E elemento = null;
        if (!estaVacia()) {
            elemento = listadoElementos[cima];
            cima--;
            tamanio--;
        } else {
            System.out.println("Pila Vacía...!!!");
        }
        return elemento;
    }

    @Override
    public E cima() {
        E elemento = null;
        if (!estaVacia()) {
            elemento = listadoElementos[cima];
        } else {
            System.out.println("Pila Vacía...!!!");
        }
        return elemento;
    }

    //Método para limpiar la pila
    @Override
    public void limpiar() {
        while (!estaVacia()) {
            remover();
        }
    }
}
