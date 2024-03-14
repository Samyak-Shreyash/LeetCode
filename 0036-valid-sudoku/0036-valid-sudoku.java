class Solution {

    public boolean isValidSudoku(char[][] board) {
        Set soduko = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String num = "-"+board[i][j];
                    if (!soduko.add(num + i) || !soduko.add(j+num)
                            || !soduko.add(i / 3 + num + j / 3))
                        return false;
                }
            }

        }
        return true;
    }
}