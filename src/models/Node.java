package models;

public class Node {
    private int valor;
    private Node next;

    public Node(int valor) {
        this.valor = valor;
        this.next = null;
    }

    public int getValor() {
        return valor;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
