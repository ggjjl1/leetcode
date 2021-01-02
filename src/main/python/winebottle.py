#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
酒瓶问题，五个空瓶可以兑一瓶啤酒，三个瓶盖可以兑一瓶啤酒，n瓶啤酒，可以喝多少次
"""

class Bottle(object):
    def numberOfBottle(self, n):
        x, y, z = 0, 0, 0
        while n > 0:
            z = z + n
            x = x + n
            y = y + n
            n = x / 5 + y / 3
            x = x % 5
            y = y % 3
        return z

def main():
    bottle = Bottle()
    print(bottle.numberOfBottle(100))

if __name__ == '__main__':
    main()