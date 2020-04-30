#!/usr/bin/env python
# -*- coding: utf-8 -*-

"Middle of the Linked List"

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def middleNode(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        p = head
        listsize = 0
        while(p.next is not None):
            p = p.next
            listsize += 1
        r = head
        middle = 0
        while middle < listsize / 2 + listsize % 2:
            r = r.next
            middle += 1
        return r

def main():
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node4 = ListNode(4)
    node5 = ListNode(5)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    head = ListNode(0)
    head.next = node1
    s = Solution()
    middle = s.middleNode(head)
    while middle is not None:
        print(middle.val)
        middle = middle.next

if __name__ == '__main__':
    main()