package com.diel.dev.structures.lists.simple;

public class SimpleLinkedList {
    private SimpleListNode root;
    private Integer length;

    public SimpleLinkedList() {
        this.length = 0;
    }

    public void insert(Integer value) {
        SimpleListNode node = new SimpleListNode(value);

        if (isEmpty()) {
            root = node;
            length++;
        } else {
            SimpleListNode aux = root;

            while (aux.getNext() != null) {
                aux = aux.getNext();
            }

            aux.setNext(node);
            length++;
        }
    }

    public Integer remove(Integer index) {
        if (isEmpty()) {
            return -1;
        }

        int count = 0;

        SimpleListNode aux = root;

        if (index == 0) {
            length--;
            root = root.getNext();
            return aux.getValue();
        }

        SimpleListNode previous = aux;

        while (aux != null) {
            previous = aux;
            aux = aux.getNext();
            count++;
            if (count == index) {
                length--;
                previous.setNext(aux.getNext());
                return aux.getValue();
            }
        }

        return -1;
    }

    public SimpleListNode getRoot() {
        return this.root;
    }

    public Integer size() {
        return length;
    }

    public boolean isEmpty() {
        return root == null;
    }
}
