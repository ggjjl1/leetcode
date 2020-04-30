#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        return self.backspacingStr(S) == self.backspacingStr(T)

    def backspacingStr(self, s):
        liststr = list(s)
        i = 0
        while i < len(liststr):
            if liststr[i] == '#':
                k = i
                liststr[i] = ''
                while k - 1 >= 0:
                    if liststr[k-1] == '':
                        k = k - 1
                    else:
                        liststr[k-1] = ''
                        break
            i = i + 1
        return ''.join(liststr)

def main():
    S = "ab#c"
    T = "b"
    s = Solution()
    print(s.backspacingStr(S))

if __name__ == '__main__':
    main()