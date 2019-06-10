package com.dailycodingproblems.jo;

public class Main {

    public static void main(String[] args) {
        Node tree = new Node(0,new Node(1),new Node(0,new Node(1,new Node(1),new Node(1)),new Node(0)));
        System.out.println(getUnivalCount(tree));
    }

    private static int getUnivalCount(Node root){
        if(root == null) return 0;
        int count = getUnivalCount(root.getLeft()) + getUnivalCount(root.getRight());
        if(isUnival(root))
            count += 1;
        return count;
    }

    private static boolean isUnival(Node node) {
        if(node == null) return true;
        if(node.getLeft() != null && node.getLeft().getValue() != node.getValue()) return false;
        if(node.getRight() != null && node.getRight().getValue() != node.getValue()) return false;
        if(isUnival(node.getLeft()) && isUnival(node.getRight())) return true;
        return false;
    }
}
