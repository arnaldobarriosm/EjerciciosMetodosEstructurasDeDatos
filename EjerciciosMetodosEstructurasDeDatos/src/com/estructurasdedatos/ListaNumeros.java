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
public class ListaNumeros<E> {

    private NodoDoble<E> listaPositivos;
    private NodoDoble<E> listaNegativos;
    private int tamanio;

    public ListaNumeros() {
        listaPositivos = listaNegativos = null;
    }

    public boolean estaVacia() {
        return listaPositivos == null && listaNegativos == null;
    }
    
    public int tamanio(){
        return tamanio;
    }

    public void insertar(int dato) {
        if (dato > 0) {
            NodoDoble positivo = new NodoDoble(dato);
            if (estaVacia()) {
                listaPositivos = positivo;
                tamanio++;
                System.out.println("El numero " + dato + " es positivo y se ha insertado correctamente a la lista de valores positivos...!!!");
            } else {
                listaPositivos.setSiguiente(positivo);
                listaPositivos = positivo;
                tamanio++;
                System.out.println("El numero " + dato + " es positivo y se ha insertado correctamente a la lista de valores positivos...!!!");
            }
        } else {
            NodoDoble negativo = new NodoDoble(dato);
            if (estaVacia()) {
                listaNegativos = negativo;
                System.out.println("El numero " + dato + " es negativo y se ha insertado correctamente a la lista de valores negativos...!!!");
            } else {
                listaNegativos.setSiguiente(negativo);
                listaNegativos = negativo;
                System.out.println("El numero " + dato + " es negativo y se ha insertado correctamente a la lista de valores negativos...!!!");
            }
        }
    }
}
