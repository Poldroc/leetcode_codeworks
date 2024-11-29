package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID841KeysAndRooms {
    public static void main(String[] args) {
        Solution solution = new ID841KeysAndRooms().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int n = rooms.size();
            boolean[] visited = new boolean[n];
            dfs(rooms, 0, visited);
            for (boolean b : visited) {
                if (!b) {
                    return false;
                }
            }
            return true;
        }

        private void dfs(List<List<Integer>> rooms, int room, boolean[] visited) {
            visited[room] = true;
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    dfs(rooms, key, visited);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
