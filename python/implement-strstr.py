#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if len(needle) == 0: return 0
        for i in range(0, len(haystack)):
            if haystack[i] == needle[0]:
                if len(haystack[i:]) < len(needle): 
                    return -1
                elif haystack[i: i+len(needle)] == needle:
                    return i
        return -1

def main():
    s = Solution()
    print(s.strStr('hello', 'll'))

if __name__ == '__main__':
    main()