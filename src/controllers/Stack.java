package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int valor) {
        Node newNode = new Node(valor);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int valor = top.getValor();
        top = top.getNext();
        size--;
        return valor;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.getValor();
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
        Node current = top;
        while (current != null) {
            System.out.print(current.getValor() + ", ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
