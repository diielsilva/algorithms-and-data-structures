package com.diel.dev.hash;

public class HashMap {
    private HashNode[] nodes;

    public HashMap() {
        this.nodes = new HashNode[20];
    }

    public void put(HashNode node) {
        if (node.hashCode() < nodes.length - 1) {
            if (nodes[node.hashCode()] == null) {
                nodes[node.hashCode()] = node;
            } else {
                System.out.println("Colision!!!");
                HashNode aux = nodes[node.hashCode()];

                if (aux.getKey() == node.getKey()) {
                    System.out.println("Updating Value!!!");
                    aux.setValue(node.getValue());
                } else {
                    while (aux.getNext() != null) {
                        if (aux.getKey() == node.getKey()) {
                            System.out.println("Updating Value!!!");
                            aux.setValue(node.getValue());
                            return;
                        }
                        aux = aux.getNext();
                    }

                    if (aux.getKey() == node.getKey()) {
                        System.out.println("Updating Value!!!");
                        aux.setValue(node.getValue());
                    } else {
                        System.out.println("New Value!!!");
                        aux.setNext(node);
                    }
                }
            }
        }
    }

    public HashNode get(Integer key) {
        HashNode node = new HashNode(key, null);
        if (node.hashCode() < nodes.length - 1) {
            if (nodes[node.hashCode()] == null) {
                return null;
            }

            if (nodes[node.hashCode()] != null && nodes[node.hashCode()].getKey() == key) {
                return nodes[node.hashCode()];
            }

            HashNode aux = nodes[node.hashCode()];

            while (aux != null) {
                if (aux.getKey() == key) {
                    return aux;
                }
                aux = aux.getNext();
            }
        }

        return null;
    }
}
