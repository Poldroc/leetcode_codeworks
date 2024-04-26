package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID474OnesAndZeroes{
	public static void main(String[] args) {
		Solution solution = new ID474OnesAndZeroes().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
		// dp[i][j]：最多有i个0和j个1的strs的最大子集的大小为dp[i][j]。
		int[][] dp = new int[m + 1][n + 1];
		int oneNum, zeroNum;
		for(String str :strs){
			oneNum=0;
			zeroNum=0;
			for (char ch : str.toCharArray()) {
				if (ch == '0') {
					zeroNum++;
				} else {
					oneNum++;
				}
			}
			//倒序遍历
			for (int i = m; i >= zeroNum; i--) {
				for (int j = n; j >= oneNum; j--) {
					dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
				}
			}
		}
		return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
