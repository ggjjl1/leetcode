#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def countElements(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        result = 0
        for x in arr:
            if x + 1 in arr: 
                result += 1
        return result


def main():
    s = Solution()
    print(s.countElements([1,1,2,2]))

if __name__ == '__main__':
    main()