package com.diel.dev.hash;

public class HashNode {
    private Integer key;
    private String value;
    private HashNode next;

    public HashNode(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }

    // This is what matters on our hash, you can choose whatever alg that you want,
    // but it need to be efficient
    @Override
    public int hashCode() {
        return key / 2;
    }

}
