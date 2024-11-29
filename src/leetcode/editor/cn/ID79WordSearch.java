package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID79WordSearch {
    public static void main(String[] args) {
        Solution solution = new ID79WordSearch().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean exist(char[][] board, String word) {
            char[] words = word.toCharArray();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (dfs(board, words, i, j, 0)) return true;
                }
            }
            return false;

        }

        private boolean dfs(char[][] board, char[] words, int i, int j, int k) {

            if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != words[k]) return false;
            if (k == words.length - 1) return true;
            // 标记当前矩阵元素： 将 board[i][j] 修改为 空字符 '' ，代表此元素已访问过，防止之后搜索时重复访问
            board[i][j] = Character.UNASSIGNED;
            // 标记当前矩阵元素： 将 board[i][j] 修改为 空字符 '' ，代表此元素已访问过，防止之后搜索时重复访问。
            boolean res = dfs(board, words, i + 1, j, k + 1) || dfs(board, words, i - 1, j, k + 1) ||
                    dfs(board, words, i, j + 1, k + 1) || dfs(board, words, i, j - 1, k + 1);
            board[i][j] = words[k];
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
