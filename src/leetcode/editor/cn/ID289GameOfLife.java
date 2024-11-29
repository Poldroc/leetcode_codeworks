package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID289GameOfLife {
    public static void main(String[] args) {
        Solution solution = new ID289GameOfLife().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void gameOfLife(int[][] board) {
            int[] neighbors = new int[]{-1, 0, 1};
            int rows = board.length;
            int cols = board[0].length;
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    int liveNeighbors = 0;
                    // 遍历邻居
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                                int i1 = row + neighbors[i];
                                int i2 = col + neighbors[j];
                                if ((i1 >= 0 && i1 < rows) && (i2 >= 0 && i2 < cols) && (board[i1][i2] == 1 ||board[i1][i2] == -1)) {
                                    liveNeighbors++;
                                }
                            }
                        }
                    }
                    if (board[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                        board[row][col] = -1;
                    }

                    if (board[row][col] == 0 && liveNeighbors == 3) {
                        board[row][col] = 2;
                    }
                }
            }
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (board[row][col] <= 0) {
                        board[row][col] = 0;
                    } else {
                        board[row][col] = 1;
                    }
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
