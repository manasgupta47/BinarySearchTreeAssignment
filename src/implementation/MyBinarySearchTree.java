package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private Node root;
    private int size;

    public MyBinarySearchTree() {
        root = null;
        size = 0;
    }

    public Node getRoot() {
        return root;
    }

    //
    @Override
    public void insert(E data) {
        implementation.Node<E> node = new implementation.Node<>(data);
        if (isEmpty()) {
            root = node;
        } else {
            Node<E> temp = root;
            Node<E> parent = null;
            while (temp != null) {
                parent = temp;
                if (data.compareTo(temp.getData()) <= 0) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (data.compareTo(parent.getData()) <= 0) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }

        }
        size++;
        System.out.println("Node inserted");
    }

}
