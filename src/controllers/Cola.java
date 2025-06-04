package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Cola {
    private Node primero;
    private Node ultimo;
    public int size;
    
    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }
    public int remove(){//mover el primer puesto y seguir al siguiente
        if (isEmpty()) {
            throw new EmptyStackException();
        } 
        int value = primero.getValor();
        primero = primero.getNext();
        size--;
        return value;
    }

    public int peek(){  //para ver el valor que está en la cima de la pila sin eliminarlo.
        if (isEmpty()) throw new EmptyStackException();
        return primero.getValor();
    } 

    public boolean isEmpty(){
        return primero == null;
    }
   
    public int size() {
        int count = 0;
        Node current = primero;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
    public void printCola() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Contenido de la cola: ");
        Node current = primero;
        while (current != null) {
            System.out.print(current.getValor() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    
}
