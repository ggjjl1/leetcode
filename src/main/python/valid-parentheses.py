#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        for x in s:
            if len(stack) > 0:
                if stack[-1] == '(' and x == ')':
                    stack.pop()
                elif stack[-1] == '[' and x == ']':
                    stack.pop()
                elif stack[-1] == '{' and x == '}':
                    stack.pop()
                else:
                    stack.append(x)
            else:
                stack.append(x)
        return len(stack) == 0

def main():
    s = Solution()
    print(s.isValid('(]'))

if __name__ == '__main__':
    main()