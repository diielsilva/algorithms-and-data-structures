package com.diel.dev.queues;

public class Queue {
    private Person first;
    private Person last;

    public void push(String name) {
        Person person = new Person(name);

        if (isEmpty()) {
            first = person;
            last = person;
        } else {
            if (first.getNext() == null) {
                first.setNext(last);
            }
            last.setNext(person);
            last = person;
        }
    }

    public Person pop() {
        Person person = new Person(first.getName());

        if (isEmpty()) {
            return null;
        } else if (first.equals(last)) {
            first = null;
            last = null;
        } else {
            first = first.getNext();
        }
        return person;
    }

    public Person getFirst() {
        if (isEmpty()) {
            return null;
        }
        return first;
    }

    public Person getLast() {
        if (isEmpty()) {
            return null;
        }
        return last;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
