#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
leetcode 23. Merge k Sorted Lists
"""

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        if len(lists) == 1: return lists[0]
        if len(lists) == 0: return None
        rlist = None
        for i in range(0, len(lists)):
            if rlist is None and lists[i] is not None:: 
                rlist = lists[i]
                continue
            p1 = rlist
            p2 = lists[i]
            while p2 is not None:
                if p2.val <= p1.val:
                    lists[i] = lists[i].next
                    p2.next = p1
                    p1 = p2
                    p2 = lists[i]
                    rlist = p1
                    continue
                pre = rlist
                while p1 is not None and p2.val > p1.val:
                    pre = p1
                    p1 = p1.next 
                if p1 is None:
                    pre.next = p2
                    p2 = None
                elif p1.val >= p2.val:
                    lists[i] = lists[i].next
                    pre.next = p2
                    p2.next = p1
                    p2 = lists[i]
                    p1 = rlist
        return rlist
                

def main():
    listnode1 = ListNode(1)
    listnode2 = ListNode(4)
    listnode3 = ListNode(5)
    listnode1.next = listnode2
    listnode2.next = listnode3
    listnode4 = ListNode(1)
    listnode5 = ListNode(3)
    listnode6 = ListNode(4)
    listnode4.next = listnode5
    listnode5.next = listnode6
    listnode7 = ListNode(2)
    listnode8 = ListNode(6)
    listnode7.next = listnode8
    lists = [listnode1,listnode4,listnode7]
    s = Solution()
    rlist = s.mergeKLists(lists)
    while rlist is not None:
        print(rlist.val)
        rlist = rlist.next

if __name__ == '__main__':
    main()
