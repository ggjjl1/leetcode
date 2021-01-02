#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        p = head
        while p is not None:
            if p.next is not None:

def main():
    pass

if __name__ == '__main__':
    main()