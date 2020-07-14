#!/usr/bin/env python
# -*- coding: utf-8 -*-

def max_points():
    n = input()
    points = []
    while n > 0:
        x, y = [int(i) for i in raw_input().split()]
        points.append((x, y))
        n = n - 1
    points.sort()
    result = []
    max_y = -1
    for e in reversed(points):
        if e[1] > max_y:
            result.append(e)
            max_y = e[1]
    return reversed(result)

def main():
    result = max_points()
    for e in result:
        print("%d %d" % e)

if __name__ == '__main__':
    main()