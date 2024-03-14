class Solution {

    public boolean isValidSudoku(char[][] board) {
        Set soduko = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    char num = board[i][j];
                    if (!soduko.add(num + "-Row:" + i) || !soduko.add(num + "-Column:" + j)
                            || !soduko.add(num + "-Board:" + i / 3 + "," + j / 3))
                        return false;
                }
            }

        }
        return true;
    }
}