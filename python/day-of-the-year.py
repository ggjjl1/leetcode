#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def dayOfYear(self, date):
        """
        :type date: str
        :rtype: int
        """
        days = 0
        year = int(date.split("-")[0])
        month = int(date.split("-")[1])
        day = int(date.split("-")[2])
        if month <= 8:
            days = 30 * (month - 1) + day + month / 2
        else:
            days = 30 * (month - 1) + day + month / 2 + month % 2
        if month <= 2:
            return days
        else:
            if year % 400 == 0:
                days = days = 1
            elif year % 4 == 0 and year % 100 <> 0:
                days = days - 1
            else:
                days = days - 2
        return days

def main():
    s = Solution()
    print(s.dayOfYear("2019-01-09"))

if __name__ == '__main__':
    main()