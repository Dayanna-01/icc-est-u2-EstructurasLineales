package controllers;

import models.NodeGeneric;

public class StackG<T> {
    private NodeGeneric<T> top;
    private int size;

    public StackG(NodeGeneric<T> top, int size) {
        this.top = top;
        this.size = size;
    }

    public NodeGeneric<T> getTop() {
        return top;
    }

    public void setTop(NodeGeneric<T> top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "StackG [top=" + top + ", size=" + size + "]";
    }

}
