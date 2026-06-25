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
public class PilaNodo<E> implements Pila<E> {

    private Nodo<E> cima;
    private int tamanio;

    public PilaNodo() {
        this.cima = null;
        this.tamanio = 0;
    }

    @Override
    public boolean estaVacia() {
        return cima == null;
    }

    @Override
    public boolean estaLlena() {
        return new PilaNodo<>() == null;
    }

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public void agregar(E elemento) {
        Nodo<E> nuevoNodo = new Nodo<>(elemento);
        if (estaVacia()) {
            cima = nuevoNodo;
        } else {
            cima.setSiguiente(nuevoNodo);
            cima = nuevoNodo;
        }
        tamanio++;
    }

    @Override
    public E remover() {
        E elemento = null;
        if (!estaVacia()) {
            elemento = cima.getElemento();
            cima = cima.getSiguiente();
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
            elemento = cima.getElemento();
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

    public String imprimir() {
        String s = "";
        PilaNodo<E> pilaAuxiliar = new PilaNodo<>();
        while (!estaVacia()) {
            E elemento = remover();
            s += "\n" + elemento;
            pilaAuxiliar.agregar(elemento);
        }
        while (!pilaAuxiliar.estaVacia()) {
            agregar(pilaAuxiliar.remover());
        }
        return s;
    }

    public static <E> PilaNodo<E> eliminarPrimerElemento(PilaNodo<E> x) {
        PilaNodo<E> y = new PilaNodo<>();
        while (!x.estaVacia()) {
            y.agregar(x.remover());
        }
        y.remover();
        while (!y.estaVacia()) {
            x.agregar(y.remover());
        }
        return x;
    }

    public static <E> void invertirExtremos(PilaNodo<E> x) {
        E elementoAuxiliar = x.remover();
        PilaNodo<E> y = new PilaNodo<>();
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

    public static <E> void copiarPila(PilaNodo<E> x) {
        PilaNodo<E> y = new PilaNodo<>();
        while (!x.estaVacia()) {
            y.agregar(x.remover());
        }
        while (!y.estaVacia()) {
            System.out.println(y.remover());
        }
    }

    public static <E> void eliminarElementoEspecifico(PilaNodo<E> x, E elemento) {
        E elementoAuxiliar = null;
        PilaNodo<E> y = new PilaNodo<>();
        if (x.estaVacia()) {
            System.out.println("Pila Vacía...!!!");
        } else {
            while (!x.estaVacia()) {
                elementoAuxiliar = x.remover();
                if (elementoAuxiliar.equals(elemento)) {
                    System.out.println("Elemento " + elemento + "Eliminado...!!!");
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

    public static <E> void eliminarElementosRepetidosConsecutivos(PilaNodo<E> x) {
        E elemento = null;
        PilaNodo<E> y = new PilaNodo<>();
        while (!x.estaVacia()) {
            elemento = x.remover();
            while (elemento.equals(x.cima())) {
                x.remover();
            }
            y.agregar(elemento);
        }
        while (!y.estaVacia()) {
            x.agregar(y.remover());
        }
    }

    public static <E> PilaNodo<E> invertirElementos(PilaNodo<E> x) {
        PilaNodo<E> y = new PilaNodo<>();
        while (!x.estaVacia()) {
            y.agregar(x.remover());
        }
        return y;
    }
}