package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
    }

    public void add(T valor) {
        NodeGeneric<T> newNode = new NodeGeneric<>(valor);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T valor = primero.getValue();
        primero = primero.getNext();
        if (primero == null) {
            ultimo = null; // la cola quedó vacía
        }
        return valor;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return primero.getValue();
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        int count = 0;
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            count++;
            aux = aux.getNext();
        }
        return count;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Contenido de la cola: ");
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            System.out.print(aux.getValue() + ", ");
            aux = aux.getNext();
        }
        System.out.println();
    }
}
