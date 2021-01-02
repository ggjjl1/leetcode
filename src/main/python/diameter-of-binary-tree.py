#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def __init__(self):
        self.maxDiameter = 0

    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.binaryTreeTraversaling(root)
        return self.maxDiameter

    def maxdepthOfBinaryTree(self, treeNode):
        "给定一棵二叉树，返回树的最大深度"
        maxdepth = 0
        p = treeNode
        if treeNode.left is None and treeNode.right is None:
            maxdepth = 1
        else:
            if treeNode.left is not None:
                maxdepth = max(1 + self.maxdepthOfBinaryTree(treeNode.left), maxdepth)
            if treeNode.right is not None:
                maxdepth = max(1 + self.maxdepthOfBinaryTree(treeNode.right), maxdepth)
        return maxdepth

    def binaryTreeTraversaling(self, treeNode):
        "遍历二叉树"
        if treeNode is not None:
            leftDepth = 0
            rightDepth = 0
            if treeNode.left is not None: 
                leftDepth = self.maxdepthOfBinaryTree(treeNode.left)
            if treeNode.right is not None:
                rightDepth = self.maxdepthOfBinaryTree(treeNode.right)
            self.maxDiameter = (leftDepth + rightDepth) if self.maxDiameter < (leftDepth + rightDepth) else self.maxDiameter
            self.binaryTreeTraversaling(treeNode.left)
            self.binaryTreeTraversaling(treeNode.right)


def main():
    treenode1 = TreeNode(1)
    treenode2 = TreeNode(2)
    treenode3 = TreeNode(3)
    treenode4 = TreeNode(4)
    treenode5 = TreeNode(5)
    treenode1.left = treenode2
    treenode1.right = treenode3
    treenode2.left = treenode4
    treenode2.right = treenode5
    s = Solution()
    # depth = s.binaryTreeTraversaling(treenode1)
    print(s.diameterOfBinaryTree(treenode1))

if __name__ == '__main__':
    main()