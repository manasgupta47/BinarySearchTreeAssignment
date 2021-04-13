package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(55);
        tree.insert(12);
        tree.insert(67);
        tree.insert(25);
        tree.insert(52);
        tree.insert(43);
        tree.inOrder(tree.getRoot());
        tree.insert(34);
        tree.inOrder(tree.getRoot());
        System.out.println(tree.search(25));
        System.out.println(tree.search(52));
    }
}
