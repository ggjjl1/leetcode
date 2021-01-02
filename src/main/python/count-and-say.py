#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        init_list = [1]
        for i in range(0, n-1):
            value = 0
            count = 1
            tmp_list = []
            for j in range(0, len(init_list)):
                if init_list[j] == value:
                    count = count + 1
                    if j + 1 == len(init_list):
                        tmp_list.append(count)
                        tmp_list.append(value)
                else:
                    if value <> 0:
                        tmp_list.append(count)
                        tmp_list.append(value)
                    if j + 1 == len(init_list):
                        tmp_list.append(1)
                        tmp_list.append(init_list[j])
                    value = init_list[j]
                    count = 1
            init_list = tmp_list
        return "".join(str(e) for e in init_list)

def main():
    s = Solution()
    print s.countAndSay(4)

if __name__ == '__main__':
    main()