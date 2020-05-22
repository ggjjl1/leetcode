package leetcode;

/**
 * Created by gaojunliang on 7/22/15.
 */
public class Invert_Binary_Tree {

    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode t;
        if(root.left!=null || root.right!=null){
            t = root.left;
            root.left = root.right;
            root.right = t;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        TreeNode t = t1.left;
        t1.left = t1.right;
        t1.right = t;
        System.out.println(t1.left.val);
    }
}
