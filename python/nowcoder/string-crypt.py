#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys

if __name__ == "__main__":
    # 读取第一行的n
    n = int(sys.stdin.readline().strip())
    alpha = 'abcdefghijklmnopqrstuvwxyz'
    for i in range(n):
        # 读取每一行
        line = sys.stdin.readline().strip()
        stringList = []
        a = [1, 2, 4]
        for j in range(0, len(line)):
            if j >= 3:
                tmp = a[j-1] + a[j-2] + a[j-3]
                a.append(tmp)
            index = (alpha.index(line[j]) + a[j]) % 26
            stringList.append(alpha[index])
        print ''.join(stringList)
