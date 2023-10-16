package com.diel.dev.trees;

public class BinarySearchTree {
    private Integer value;
    private BinarySearchTree left;
    private BinarySearchTree right;

    // CONSTRUCTORS
    public BinarySearchTree() {
    }

    public BinarySearchTree(Integer value) {
        this.value = value;
    }

    public BinarySearchTree(Integer value, BinarySearchTree left, BinarySearchTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // GETTERS AND SETTERS
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

    public BinarySearchTree getRight() {
        return right;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
    }

    // METHODS
    public void insert(Integer value) {
        if (isEmpty()) {
            this.value = value;
        } else if (value < this.value) {
            if (left == null) {
                left = new BinarySearchTree(value);
            } else {
                left.insert(value);
            }
        } else if (value > this.value) {
            if (right == null) {
                right = new BinarySearchTree(value);
            } else {
                right.insert(value);
            }
        }
    }

    public int search(Integer value) {
        if (!isEmpty()) {
            if (this.value == value) {
                return value;
            } else if (value < this.value) {
                if (left != null) {
                    return left.search(value);
                }
            } else if (value > this.value) {
                if (right != null) {
                    return right.search(value);
                }
            }
        }
        return -1;
    }

    public void preOrder() {
        if (!isEmpty()) {
            System.out.println(value);
            if (left != null) {
                left.preOrder();
            }
            if (right != null) {
                right.preOrder();
            }
        }
    }

    public void inOrder() {
        if (!isEmpty()) {
            if (left != null) {
                left.inOrder();
            }
            System.out.println(value);
            if (right != null) {
                right.inOrder();
            }
        }
    }

    public void postOrder() {
        if (!isEmpty()) {
            if (right != null) {
                right.postOrder();
            }

            if (left != null) {
                left.postOrder();
            }

            System.out.println(value);
        }
    }

    public void inReverseOrder() {
        if (!isEmpty()) {
            if (right != null) {
                right.inReverseOrder();
            }
            System.out.println(value);
            if (left != null) {
                left.inReverseOrder();
            }
        }
    }

    public BinarySearchTree remove(int value) {

        if (this.value == value) {
            if (left == null && right == null) {
                return null;
            } else if (left != null && right == null) {
                return left;
            } else if (left == null && right != null) {
                return right;
            } else {
                BinarySearchTree aux = left;
                while (aux.right != null) {
                    aux = aux.right;
                }
                this.value = aux.value;
                aux.value = value;
                left = left.remove(value);
            }

        } else if (this.value < value) {
            left = left.remove(value);
        } else if (value > this.value) {
            right = right.remove(value);
        }

        return this;
    }

    public boolean isEmpty() {
        return value == null;
    }

}
