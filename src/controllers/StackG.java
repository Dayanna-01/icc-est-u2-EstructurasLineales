package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class StackG<T> {
    private NodeGeneric<T> top;
    private int size;

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public void push(T valor) {
        NodeGeneric<T> newNode = new NodeGeneric<>(valor);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T valor = top.getValue();
        top = top.getNext();
        size--;
        return valor;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            System.out.println();
            return;
        }
        System.out.println("Contenido de la pila:");
        NodeGeneric<T> current = top;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
