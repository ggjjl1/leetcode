package com.ggjjl1.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int sumNumbers(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        int sum = 0;
        if (root != null) {
            treeTraversal(root, 0, nums);
        }
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }

    public void treeTraversal(TreeNode node, int num, List<Integer> nums) {
        if (node.left == null && node.right == null) {
            nums.add(num * 10 + node.val);
            return;
        }
        if (node.left != null) {
            treeTraversal(node.left, num * 10 + node.val, nums);
        }
        if (node.right != null) {
            treeTraversal(node.right, num * 10 + node.val, nums);
        }
    }
}
