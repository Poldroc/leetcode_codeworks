package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID207CourseSchedule {
    public static void main(String[] args) {
        Solution solution = new ID207CourseSchedule().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            // 入度表
            int[] indegrees = new int[numCourses];
            List<List<Integer>> adjacency = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < numCourses; i++)
                adjacency.add(new ArrayList<>());

            for (int[] cp : prerequisites) {
                indegrees[cp[0]]++;
                // cp[1] -> cp[0]
                adjacency.get(cp[1]).add(cp[0]);
            }

            for (int i = 0; i < numCourses; i++) {
                if (indegrees[i] == 0) queue.add(i);
            }

            while (!queue.isEmpty()) {
                int pre = queue.poll();
                // 学习入度为0的课
                numCourses--;
                // pre课作为入度，被指向的课入度--
                for (int cur : adjacency.get(pre)) {
                    if (--indegrees[cur] == 0) queue.add(cur);
                }
            }

            return numCourses == 0;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
