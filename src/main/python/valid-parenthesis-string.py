#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def checkValidString(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        for i in s:
            if i == ')':
                if len(stack) > 0 and stack[-1] == '(':
                    stack.pop()
                else:
                    stack.append(i)
            else:
                stack.append(i)
        return len(stack) == 0

def main():
    s = Solution()
    print(s.checkValidString('((()))'))

if __name__ == '__main__':
    main()