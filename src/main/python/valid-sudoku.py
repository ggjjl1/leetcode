#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        for i in range(0, 9):
            list_x = []
            list_y = []
            for j in range(0, 9):
                if board[i][j] <> '.': list_x.append(board[i][j])
                if board[j][i] <> '.': list_y.append(board[j][i])
            print("listX: [%s]"%",".join(list_x))
            print("listY: [%s]"%",".join(list_y))
            if len(set(list_x)) <> len(list_x) or len(set(list_y)) <> len(list_y): return False
        for x in range(0, 3):
            for y in range(0, 3):
                list_z = []
                for z in range(3*x, 3*x+3):
                    for g in range(3*y, 3*y+3):
                        if board[z][g] <> '.': list_z.append(board[z][g])
                if len(set(list_z)) <> len(list_z): return False
        return True
        
def main():
    board = [
        ["5","3",".",".","7",".",".",".","."],
        ["6",".",".","1","9","5",".",".","."],
        [".","9","8",".",".",".",".","6","."],
        ["8",".",".",".","6",".",".",".","3"],
        ["4",".",".","8",".","3",".",".","1"],
        ["7",".",".",".","2",".",".",".","6"],
        [".","6",".",".",".",".","2","8","."],
        [".",".",".","4","1","9",".",".","5"],
        [".",".",".",".","8",".",".","7","9"]
    ]
    board1 = [
        [".",".","4",".",".",".","6","3","."],
        [".",".",".",".",".",".",".",".","."],
        ["5",".",".",".",".",".",".","9","."],
        [".",".",".","5","6",".",".",".","."],
        ["4",".","3",".",".",".",".",".","1"],
        [".",".",".","7",".",".",".",".","."],
        [".",".",".","5",".",".",".",".","."],
        [".",".",".",".",".",".",".",".","."],
        [".",".",".",".",".",".",".",".","."]
    ]
    board2 = [
        ["5","3",".",".","7",".",".",".","."],
        ["6",".",".","1","9","5",".",".","."],
        [".","9","8",".",".",".",".","6","."],
        ["8",".",".",".","6",".",".",".","3"],
        ["4",".",".","8",".","3",".",".","1"],
        ["7",".",".",".","2",".",".",".","6"],
        [".","6",".",".",".",".","2","8","."],
        [".",".",".","4","1","9",".",".","5"],
        [".",".",".",".","8",".",".","7","9"]
    ]
    s = Solution()
    print(s.isValidSudoku(board2))

if __name__ == '__main__':
    main()
