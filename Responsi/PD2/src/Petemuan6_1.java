/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
class NodeTree {

    float data;
    NodeTree left;
    NodeTree right;
}

public class Petemuan6_1 {

    static NodeTree root;

    public static void main(String[] args) {
        addToTree(5);
        addToTree(8);
        addToTree(7);
        addToTree(6);
        addToTree(9);
        addToTree(3);
        addToTree(4);
        addToTree(1);
        addToTree(2);
        printNode("", "Root : ", root);
        findNode(2);
    }

    public static void addToTree(float number) {
        NodeTree new_node = new NodeTree();
        new_node.data = number;
        if (root == null) {
            root = new_node;
        } else {
            NodeTree current = root;
            while (current != null) {
                if (new_node.data > current.data) {
                    if (current.right == null) {
                        current.right = new_node;
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    if (current.left == null) {
                        current.left = new_node;
                        break;
                    } else {
                        current = current.left;
                    }
                }
            }
        }
    }

    public static void printNode(String space, String prefix, NodeTree node) {
        System.out.println(space + prefix + node.data);
        if (node.left != null) {
            printNode(space + " ", "L : ", node.left);
        }
        if (node.right != null) {
            printNode(space + " ", "R : ", node.right);
        }
    }

    public static void findNode(float data) {
        NodeTree cari = findNodeTree(root, data);
        if (cari != null) {
            System.out.println(cari.data);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }

    public static NodeTree findNodeTree(NodeTree node, float data) {
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            if (data > node.data) {
                node = node.right;
            }
            if (data < node.data) {
                node = node.left;
            }
        }
        return null;
    }
}
