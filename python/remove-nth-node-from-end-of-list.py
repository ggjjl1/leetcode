#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        pointers = []
        p = head
        while p is not None:
            pointers.append(p)
            p = p.next
        m = len(pointers) - n
        if m - 1 < 0:
            head = head.next
        else:
            pointers[m-1].next = pointers[m].next
        return head  

def main():
    head = ListNode()
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node4 = ListNode(4)
    node5 = ListNode(5)
    node1.next = node2
    # node2.next = node3
    # node3.next = node4
    # node4.next = node5
    head.next = node1
    
    s = Solution()
    p = s.removeNthFromEnd(head, 1)
    while p.next is not None:
        p = p.next
        print(p.val)

if __name__ == '__main__':
    main()