#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
leetcode 10. Regular Expression Matching
"""

class Solution(object):
    def isMatch(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """
        return self.matchString(s, p, 0, 0)

    def matchString(self, s, p, i, j):
        print("i: %d, j: %d"%(i,j))
        if i == len(s) and j == len(p): return True
        if i < len(s) and j == len(p): 
            return False
        if i == len(s) and j < len(p):
            if j + 1 < len(p) and p[j+1] == '*':
                if j + 2 == len(p): return True
                else: return self.matchString(s, p, i, j + 2)
            else: return False
        if s[i] == p[j] or p[j] == '.':
            if j + 1 < len(p) and p[j+1] == '*':
                if j + 2 == len(p) and i + 1 == len(s): return True
                if self.matchString(s, p, i+1, j):
                    return True
                elif self.matchString(s, p, i+1 ,j+2):
                    return True
                else:
                    return self.matchString(s, p, i, j+2)
            else:
                if j + 1 == len(p) and i + 1 == len(s): 
                    return True
                else: 
                    return self.matchString(s, p, i+1, j+1)
        else:
            if j + 1 < len(p) and p[j+1] == '*':
                return self.matchString(s, p, i, j + 2)
            else:
                return False

def recursion(n):
    print(n)
    if n < 10: recursion(n+1)

def main():
    st = "aaaaaaaab"
    p = "a*a*a*a*a*a*a*a*c"
    # s = Solution()
    # if s.isMatch(st, p):
    #     print("字符串s: %s, 表达式p: %s, 匹配成功." % (st, p))
    # else:
    #     print("字符串s: %s, 表达式p: %s, 匹配失败." % (st, p))
    recursion(1)

if __name__ == '__main__':
    main()