package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int valor) {
        Node newNode = new Node(valor);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int valor = top.getValor();
        top = top.getNext();
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
        System.out.print("Contenido de la pila: ");
        System.out.println();
        Node current = top;
        while (current != null) {
            System.out.print(current.getValor() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
