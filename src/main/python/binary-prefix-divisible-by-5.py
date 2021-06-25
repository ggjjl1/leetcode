#!/usr/bin/env pythoon
# -*- coding: utf-8 -*-

class Solution(object):
    def prefixesDivBy5(self, A):
        """
        :type A: List[int]
        :rtype: List[bool]
        """
        answer = []
        num = 0
        for i in A:
            num = num * 2 + i
            if num % 5 == 0:
                answer.append(True)
            else:
                answer.append(False)

        return answer


if __name__ == '__main__':
    s = Solution()
    print(s.prefixesDivBy5([0,1,1]))