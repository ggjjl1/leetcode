#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1 is None: return l2
        if l2 is None: return l1
        p1 = l1
        p2 = l2
        pre = p1
        rlist = p1
        while(p2 is not None):
            if p2.val <= p1.val:
                if pre == p1:
                    pre = p2
                    p2 = p2.next
                    pre.next = p1
                    rlist = pre
                else:
                    pre.next = p2
                    p2 = p2.next
                    pre.next.next = p1
                    pre = pre.next
            else:
                while p2.val > p1.val:
                    if p1.next is not None:
                        pre = p1
                        p1 = p1.next
                    else:
                        p1.next = p2
                        p2 = None
                        break
        return rlist

def main():
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(4)
    node1.next = node2
    node2.next = node3
    node4 = ListNode(1)
    node5 = ListNode(3)
    node6 = ListNode(5)
    node4.next = node5
    node5.next = node6
    l1 = node1
    l2 = node4
    s = Solution()
    result = s.mergeTwoLists(l1,l2)
    while result is not None:
        print(result.val)
        result = result.next

if __name__ == '__main__':
    main()