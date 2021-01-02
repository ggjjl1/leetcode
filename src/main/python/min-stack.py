#!/usr/bin/env python
# -*- coding: utf-8 -*-

class MinStack(object):

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []
    

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        self.stack.append(x)
        

    def pop(self):
        """
        :rtype: None
        """
        self.stack.pop()
        

    def top(self):
        """
        :rtype: int
        """
        return self.stack[-1]
        

    def getMin(self):
        """
        :rtype: int
        """
        result = self.stack[0]
        for i in range(1, len(self.stack)):
            if self.stack[i] < result:
                result = self.stack[i]
        return result


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()


def main():
    obj = MinStack()
    obj.push(-2)


if __name__ == '__main__':
    main()