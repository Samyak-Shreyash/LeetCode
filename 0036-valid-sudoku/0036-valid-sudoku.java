class Solution {
    public boolean checkRow(char[][] board, int i) {
        int[] check = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int val = 0;
        for (int j = 0; j < 9; j++) {
            if (board[i][j] > '0' && board[i][j] <= '9') {
                val = board[i][j] - '1';
                if (check[val] != 0) {
                    return false;
                }
                check[val]++;
            }
        }
        return true;
    }

    public boolean checkColumn(char[][] board, int j) {
        int[] check = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int val = 0;
        for (int i = 0; i < 9; i++) {

            if (board[i][j] > '0' && board[i][j] <= '9') {
                val = board[i][j] - '1';
                if (check[val] != 0) {
                    return false;
                }
                check[val]++;
            }
        }
        return true;
    }

    public boolean checkBox(char[][] board, int i, int j) {
        if (i > 6 || j > 6)
            return false;
        int[] check = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int val = 0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (board[i + k][j + l] > '0' && board[i + k][j + l] <= '9') {
                    val = board[i + k][j + l] - '1';
                    if (check[val] != 0) {
                        return false;
                    }
                    check[val]++;
                }
            }

        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!(checkRow(board, i) && checkColumn(board, i)))
                return false;
            if (i % 3 == 0) {
                for (int j = 0; j < 7; j += 3)
                    if (!checkBox(board, i, j))
                        return false;
            }
            if (!(checkRow(board, i) && checkColumn(board, i)))
                return false;
        }
        return true;
    }
}