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
public class ColaArreglo<E> implements Cola<E>{

    private E[] listadoElementos;
    private int primero;
    private int ultimo;
    private int maximo;
    private int tamanio;

    public ColaArreglo() {
        maximo = 100;
        listadoElementos = (E[]) new Object[maximo];
        primero = -1;
        ultimo = -1;
        tamanio = 0;
    }

    public ColaArreglo(int capacidadInicial) {
        maximo = capacidadInicial;
        listadoElementos = (E[]) new Object[this.maximo];
        primero = -1;
        ultimo = -1;
        tamanio = 0;
    }

    @Override
    public boolean estaVacia() {
        return primero == -1;
    }

    @Override
    public boolean estaLlena() {
        return primero == maximo - 1;
    }

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public void agregar(E elemento) {
        if (!estaLlena()) {
            listadoElementos[ultimo] = elemento;
            ultimo++;
            tamanio++;
        } else {
            System.out.println("Cola Llena...!!!");
        }
    }

    @Override
    public E remover() {
        E elemento = null;
        if (!estaVacia()) {
            elemento = listadoElementos[primero];
            primero--;
            tamanio--;
        } else {
            System.out.println("Cola Vacía...!!!");
        }
        return elemento;
    }

    @Override
    public E primero() {
        E elemento = null;
        if (!estaVacia()) {
            elemento = listadoElementos[primero];
        } else {
            System.out.println("Cola Vacía...!!!");
        }
        return elemento;
    }

    @Override
    public E ultimo() {
        E elemento = null;
        if (!estaVacia()) {
            elemento = listadoElementos[ultimo];
        } else {
            System.out.println("Cola Vacía...!!!");
        }
        return elemento;
    }

    //Método para limpiar la cola.
    @Override
    public void limpiar() {
        while (!estaVacia()) {
            remover();
        }
    }
}
