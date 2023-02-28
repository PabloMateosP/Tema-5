package Practica;

import java.util.NoSuchElementException;

public class Cola<T> {
    private Nodo<T> primerNodo;
    private Nodo<T> ultimoNodo;
    private int longitud;

    private static class Nodo<T> {
        private T valor;
        private Nodo<T> siguiente;

        public Nodo(T valor, Nodo<T> siguiente) {
            this.valor = valor;
            this.siguiente = siguiente;
        }

        public T getValor() {
            return valor;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }
    }

    public Cola() {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.longitud = 0;
    }

    public void encolar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento, null);

        if (esVacia()) {
            primerNodo = nuevoNodo;
        } else {
            ultimoNodo.setSiguiente(nuevoNodo);
        }

        ultimoNodo = nuevoNodo;
        longitud++;
    }

    public T desencolar() {
        if (esVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }

        T valor = primerNodo.getValor();
        primerNodo = primerNodo.getSiguiente();

        if (primerNodo == null) {
            ultimoNodo = null;
        }

        longitud--;
        return valor;
    }

    public T frente() {
        if (esVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }

        return primerNodo.getValor();
    }

    public Cola<T> resto() {
        if (esVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }

        Cola<T> resto = new Cola<>();
        Nodo<T> actual = primerNodo.getSiguiente();

        while (actual != null) {
            resto.encolar(actual.getValor());
            actual = actual.getSiguiente();
        }

        return resto;
    }

    public void limpiar() {
        primerNodo = null;
        ultimoNodo = null;
        longitud = 0;
    }

    public boolean esVacia() {
        return longitud == 0;
    }

    public int longitud() {
        return longitud;
    }
}

