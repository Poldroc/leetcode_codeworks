package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID347TopKFrequentElements {
    public static void main(String[] args) {
        Solution solution = new ID347TopKFrequentElements().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            // key为数组元素值,val为对应出现次数
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            PriorityQueue<int[]> queue = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                queue.add(new int[]{entry.getKey(),entry.getValue()});
            }
            int[] ans = new int[k];
            for (int i = 0;i<k;i++){
                ans[i] = Objects.requireNonNull(queue.poll())[0];
            }
            return ans;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
