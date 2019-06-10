package com.dailycodingproblems.jo;

public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node(int i, Node node, Node node1) {
        value = i;
        left = node;
        right = node1;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public Node(int v){
        value = v;
        left = null;
        right = null;
    }
}
