/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dsalab.bst_lab;

import java.util.LinkedList;
import java.util.Queue;

public class Bst_lab {
    // ... (rest of the code remains unchanged)
}

 class BSTLab {
    ClassNode root;

    // Node class definition
    static class ClassNode {
        int value;
        ClassNode left;
        ClassNode right;

        ClassNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    BSTLab() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    ClassNode insertRecursive(ClassNode current, int value) {
        if (current == null) {
            return new ClassNode(value);
        }
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    public int countNodes() {
        return count(root);
    }

    private int count(ClassNode current) {
        if (current == null) {
            return 0;
        }
        return 1 + count(current.left) + count(current.right);
    }

    public boolean search(int value) {
        return searchNodeClass(root, value);
    }

    private boolean searchNodeClass(ClassNode current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        if (value < current.value) {
            return searchNodeClass(current.left, value);
        } else {
            return searchNodeClass(current.right, value);
        }
    }

    public void inOrder() {
        System.out.println("In-order:");
        inOrderTraversal(root);
        System.out.println();
    }

    void inOrderTraversal(ClassNode current) {
        if (current != null) {
            inOrderTraversal(current.left);
            System.out.print(current.value + " ");
            inOrderTraversal(current.right);
        }
    }

    public void preOrder() {
        System.out.println("Pre-order:");
        preOrderTraversal(root);
        System.out.println();
    }

    void preOrderTraversal(ClassNode current) {
        if (current != null) {
            System.out.print(current.value + " ");
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    public void postOrder() {
        System.out.println("Post-order:");
        postOrderTraversal(root);
        System.out.println();
    }

    void postOrderTraversal(ClassNode current) {
        if (current != null) {
            postOrderTraversal(current.left);
            postOrderTraversal(current.right);
            System.out.print(current.value + " ");
        }
    }

    public void levelOrder() {
        System.out.println("Level-Order:");
        if (root == null) {
            System.out.println();
            return;
        }

        Queue<ClassNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ClassNode current = queue.poll();
            System.out.print(current.value + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BSTLab bst = new BSTLab();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        System.out.println("Node Count: " + bst.countNodes());
        System.out.println("Search for 7: " + bst.search(7));
        System.out.println("Search for 20: " + bst.search(20));

        bst.inOrder();
        bst.preOrder();
        bst.postOrder();
        bst.levelOrder();
    }
}
