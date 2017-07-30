package java;

import apple.laf.JRSUIUtils;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * Created by gaojunliang on 8/17/15.
 */
public class Binary_Tree_Paths {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }

    public List<String> binaryTreePaths(TreeNode root) {
        TreeNode node = root;
        StringBuilder stringPath = new StringBuilder();
        stringPath.append(node.val);
        while(node.left != null){
            stringPath.append("->"+node.left.val);
        }
        return null;
    }

    public static void main(String[] args) {
        /**
         *     1
         *   /  \
         *  2    3
         *   \
         *    5
         */
        TreeNode nodeTree32 = new TreeNode(5);
        nodeTree32.left = null;
        nodeTree32.right = null;
        TreeNode nodeTree21 = new TreeNode(2);
        nodeTree21.left = null;
        nodeTree21.right = nodeTree32;
        TreeNode nodeTree22 = new TreeNode(3);
        nodeTree22.left = null;
        nodeTree22.right = null;
        TreeNode nodeTree11 = new TreeNode(1);
        nodeTree32.left = nodeTree21;
        nodeTree32.right = nodeTree22;

    }
}
