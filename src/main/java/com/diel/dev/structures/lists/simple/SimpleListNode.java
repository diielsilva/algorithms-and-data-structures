package com.diel.dev.structures.lists.simple;

public class SimpleListNode {
    private Integer value;
    private SimpleListNode next;

    public SimpleListNode() {

    }

    public SimpleListNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public SimpleListNode getNext() {
        return next;
    }

    public void setNext(SimpleListNode next) {
        this.next = next;
    }

}
