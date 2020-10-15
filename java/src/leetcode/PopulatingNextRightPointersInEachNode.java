package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightPointersInEachNode {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;

    public static Node connect(Node root) {
        if (root == null) return root;
        List<Node> tempList = new ArrayList<>();
        tempList.add(root);
        while (tempList.size() > 0) {
            Node preNode = null;
            int tempLength = tempList.size();
            for (int i = 0; i < tempLength; i++) {
                if (preNode == null) {
                    preNode = tempList.get(0);
                } else {
                    preNode.next = tempList.get(0);
                    preNode = preNode.next;
                }
                if (tempList.get(0).left != null) {
                    tempList.add(tempList.get(0).left);
                }
                if (tempList.get(0).right != null) {
                    tempList.add(tempList.get(0).right);
                }
                tempList.remove(0);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        List<String> tempList = new ArrayList<>();
        tempList.add(null);
        System.out.println(tempList.size());
    }

}
