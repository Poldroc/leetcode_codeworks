package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID674LongestContinuousIncreasingSubsequence{
	public static void main(String[] args) {
		Solution solution = new ID674LongestContinuousIncreasingSubsequence().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLengthOfLCIS(int[] nums) {
		if (nums.length==0)return 0;
		int res = 1;
		int count =1;
		for (int i = 1; i <nums.length; i++) {
			if (nums[i]>nums[i-1]){
				count++;
			}else {
				count =1;
			}
			res = Math.max(res,count);
		}
		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
