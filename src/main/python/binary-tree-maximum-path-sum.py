#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def maxPathSum(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.maxpath = root.val if root is not None else 0
        self.treeTraverse(root)
        return self.maxpath

    def treeTraverse(self, root):
        if root is not None:
            lmax = max(0, self.treeTraverse(root.left))
            rmax = max(0, self.treeTraverse(root.right))
            self.maxpath = max(self.maxpath, lmax + rmax + root.val)
            return root.val + max(lmax, rmax)
        else:
            return 0

def main():
    pass

if __name__ == '__main__':
    main()