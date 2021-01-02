#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        pointer = head; head = None
        while pointer is not None:
            pre = pointer
            pointer = pointer.next
            pre.next = head
            head = pre
        
        return head

def main():
    pass

if __name__ == '__main__':
    main()