#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        result = []
        keys = []
        for i in range(0, len(strs)):
            if "".join(sorted(strs[i])) in keys:
                index = keys.index("".join(sorted(strs[i])))
                result[index].append(strs[i])
            else:
                keys.append("".join(sorted(strs[i])))
                result.append([strs[i]])
        return result

def main():
    s = Solution()
    r = s.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
    for l in r:
        print("-".join(l))

if __name__ == '__main__':
    main()