#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        maps = {
            '2': ['a','b','c'],
            '3': ['d','e','f'],
            '4': ['g','h','i'],
            '5': ['j','k','l'],
            '6': ['m','n','o'],
            '7': ['p','q','r','s'],
            '8': ['t','u','v'],
            '9': ['w','x','y','z']
        }
        result = []
        for d in digits:
            if len(result) == 0: 
                result = maps[d]
                continue
            words = []
            for x in result:
                for y in maps[d]:
                    word = x + y
                    words.append(word)
            result = words
        return result    

def main():
    s = Solution()
    print(s.letterCombinations('23'))

if __name__ == '__main__':
    main()