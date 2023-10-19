package com.diel.dev.stack;

public class Stack {
    private StackNode top;

    public void push(Integer value) {
        StackNode node = new StackNode(value);

        if (isEmpty()) {
            top = node;
        } else {
            node.setPrevious(top);
            top.setNext(node);
            top = node;
        }
    }

    public StackNode getTop() {
        if (isEmpty()) {
            return null;
        }
        return top;
    }

    public StackNode getPrevious() {
        if (isEmpty()) {
            return null;
        }
        return top.getPrevious();
    }

    public StackNode pop() {
        if (isEmpty()) {
            return null;
        }
        StackNode auxNode = new StackNode(top.getValue());
        top.setNext(null);
        top = top.getPrevious();
        return auxNode;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
