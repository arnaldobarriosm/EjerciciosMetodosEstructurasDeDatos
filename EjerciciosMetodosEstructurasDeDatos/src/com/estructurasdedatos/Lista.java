package com.estructurasdedatos;

/**
 *
 * @author abarrios
 * @param <E> elemento
 */
public interface Lista<E> {

    boolean estaVacia();

    boolean estaLlena();

    int tamanio();

    void agregar(E elemento);

    void agregarPrimero(E elemento);

    void agregarUltimo(E elemento);

    E remover();

    E primero();

    E ultimo();

    //Método para recorrer la lista hacia adelante
    String mostrarAdelante();

    //Método para recorrer la lista hacia atrás
    String mostrarAtras();


}
