#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys

if __name__ == '__main__':
    n = sys.stdin.readline().strip()
    arr = []
    for i in range(0, int(n)):
        arr.append(map(int, sys.stdin.readline().strip().split(',')))
    
    m = sys.stdin.readline().strip()
    steps = 0
    for j in range(0, int(m)):
        [x1, y1, x2, y2] = map(int, sys.stdin.readline().strip().split(','))
        
        ix = range(len(arr[0]))
        iy = range(len(arr))
        if x1 in ix and y1 in iy and x2 in ix and y2 in iy:
            if arr[y1][x1] <> arr[y2][x2]:
                print(j)
                break

            xy = [arr[y1][i] for i in range(x1,x2,1 if x2>=x1 else -1)] + [arr[j][x2] for j in range(y1,y2+(1 if y2>=y1 else -1),1 if y2>=y1 else -1)]
            yx = [arr[i][x1] for i in range(y1,y2,1 if y2>=y1 else -1)] + [arr[y2][j] for j in range(x1,x2+(1 if x2>=x1 else -1),1 if x2>=x1 else -1)]

            print(xy)
            print(yx)

            if len(set(xy)) == 1 or 0 in set(xy): continue
            if len(set(yx)) == 1 or 0 in set(yx): continue

            if x1 == x2 and (x1 == 0 or 
        
        else:
            print(j)
            break
        
        steps = steps + 1
    
    if steps == n:
        print('ok')