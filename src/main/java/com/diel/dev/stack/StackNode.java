package com.diel.dev.stack;

public class StackNode {
    private Integer value;
    private StackNode next;
    private StackNode previous;

    public StackNode() {
    }

    public StackNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public StackNode getPrevious() {
        return previous;
    }

    public void setPrevious(StackNode previous) {
        this.previous = previous;
    }

}
