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
public class ColaNodo<E> implements Cola<E> {

    private NodoDoble<E> primero;
    private NodoDoble<E> ultimo;
    private int tamanio;

    public ColaNodo() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    @Override
    public boolean estaVacia() {
        return primero == null;
    }

    @Override
    public boolean estaLlena() {
        return new ColaNodo<>() == null;
    }

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public void agregar(E elemento) {
        NodoDoble<E> nuevoNodo = new NodoDoble<>(elemento);
        if (estaVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        tamanio++;
    }

    @Override
    public E remover() {
        E elemento = null;
        if (!estaVacia()) {
            elemento = primero.getElemento();
            primero = primero.getSiguiente();
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
            elemento = primero.getElemento();
        }
        return elemento;
    }

    @Override
    public E ultimo() {
        E elemento = null;
        if (!estaVacia()) {
            elemento = ultimo.getElemento();
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

    //Método imprimir Funciona Perfecto.
    public String imprimir() {
        String s = "";
        ColaNodo<E> colaAuxiliar = new ColaNodo<>();
        while (!estaVacia()) {
            E elemento = remover();
            s += "\n" + elemento;
            colaAuxiliar.agregar(elemento);
        }
        while (!colaAuxiliar.estaVacia()) {
            agregar(colaAuxiliar.remover());
        }
        return s;
    }

    //Método eliminarPrimerElemento Funciona Perfecto.
    public static <E> ColaNodo<E> eliminarPrimerElemento(ColaNodo<E> x) {
        ColaNodo<E> y = new ColaNodo<>();
        while (!x.estaVacia()) {
            y.agregar(x.remover());
        }
        y.remover();
        while (!y.estaVacia()) {
            x.agregar(y.remover());
        }
        return x;
    }

    public static <E> void invertirExtremos(ColaNodo<E> x) {
        E elementoAuxiliar = x.remover();
        ColaNodo<E> y = new ColaNodo<>();
        while (!x.estaVacia()) {
            y.agregar(x.remover());
        }
        x.agregar(elementoAuxiliar);
        elementoAuxiliar = y.remover();
        while (!y.estaVacia()) {
            x.agregar(y.remover());
        }
        x.agregar(elementoAuxiliar);
    }

    //Método copiarCola Funciona Perfecto.
    public static <E> void copiarCola(ColaNodo<E> x) {
        ColaNodo<E> y = new ColaNodo<>();
        while (!x.estaVacia()) {
            y.agregar(x.remover());
        }
        while (!y.estaVacia()) {
            System.out.println(y.remover());
        }
    }

    //Método eliminarElementoEspecifico Funciona Perfecto.
    public static <E> void eliminarElementoEspecifico(ColaNodo<E> x, E elemento) {
        E elementoAuxiliar = null;
        ColaNodo<E> y = new ColaNodo<>();
        if (x.estaVacia()) {
            System.out.println("Cola Vacía...!!!");
        } else {
            while (!x.estaVacia()) {
                elementoAuxiliar = x.remover();
                if (elementoAuxiliar.equals(elemento)) {
                    System.out.println("Elemento " + elemento + " Eliminado...!!!");
                    elemento = null;
                } else {
                    y.agregar(elementoAuxiliar);
                }
            }
            while (!y.estaVacia()) {
                x.agregar(y.remover());
            }
        }
    }

    public static <E> void eliminarElementosRepetidosConsecutivos(ColaNodo<E> x) {
        E elemento = null;
        ColaNodo<E> y = new ColaNodo<>();
        while (!x.estaVacia()) {
            elemento = x.remover();
            while (elemento.equals(x.primero())) {
                x.remover();
            }
            y.agregar(elemento);
        }
        while (!y.estaVacia()) {
            x.agregar(y.remover());
        }
    }

    public static <E> ColaNodo<E> invertirElementos(ColaNodo<E> x) {
        ColaNodo<E> y = new ColaNodo<>();
        while (!x.estaVacia()) {
            y.agregar(x.remover());
        }
        return y;
    }
}
