import javax.swing.tree.TreeNode;

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
        while(root.left!=null && root.right!=null){
            t = root.left;
            root.left = root.right;
            root.left = t;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode31 = new TreeNode(1);
        treeNode31.left = null;
        treeNode31.right = null;
        TreeNode treeNode32 = new TreeNode(3);
        treeNode32.left = null;
        treeNode32.right = null;
        TreeNode treeNode33 = new TreeNode(6);
        treeNode33.left = null;
        treeNode33.right = null;
        TreeNode treeNode34 = new TreeNode(9);
        treeNode34.left = null;
        treeNode34.right = null;
        TreeNode treeNode21 = new TreeNode(2);
        treeNode32.left = treeNode31;
        treeNode32.right = treeNode32;
        TreeNode treeNode22 = new TreeNode(7);
        treeNode32.left = treeNode33;
        treeNode32.right = treeNode34;
        TreeNode treeNode11 = new TreeNode(4);
        treeNode32.left = treeNode21;
        treeNode32.right = treeNode22;
        TreeNode treeNode = treeNode11;
        invertTree(treeNode11);
    }
}
