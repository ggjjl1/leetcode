#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys

if __name__ == '__main__':
    s, n = map(int, sys.stdin.readline().strip().split(' '))
    if s * 2 % n != 0:
        print(-1)
    else:
        k1 = (s * 2 / n - (n - 1)) / 2
        if k1 <= 0:
            print(-1)
        else:
            k = [k1 + i for i in range(n)]
            if sum(k) != s:
                print(-1)
            else:
                for e in k: print(e),