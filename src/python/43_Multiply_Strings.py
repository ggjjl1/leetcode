#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def multiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        if num1 == '0' or num2 == '0': return '0'
        string2digits = {'1': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9, '0': 0}
        digits2string = {1: '1', 2: '2', 3: '3', 4: '4', 5: '5', 6: '6', 7: '7', 8: '8', 9: '9', 0: '0'}
        sum1, sum2 = 0, 0
        for i in range(0, len(num1)):
            sum1 = sum1 * 10 + string2digits[num1[i]]
        for j in range(0, len(num2)):
            sum2 = sum2 * 10 + string2digits[num2[j]]
        sum = sum1 * sum2
        result = ''
        while sum > 0:
            result = digits2string[sum%10] + result
            sum = sum / 10
        return result
        
def main():
    s = Solution()
    print(s.multiply("123", "456"))

if __name__ == '__main__':
    main()