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
            PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);
            //大顶堆需要对所有元素进行排序
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pq.add(new int[]{entry.getKey(), entry.getValue()});
            }
            int[] ans = new int[k];
            for(int i=0;i<k;i++){//依次从队头弹出k个,就是出现频率前k高的元素
                ans[i] = Objects.requireNonNull(pq.poll())[0];
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
