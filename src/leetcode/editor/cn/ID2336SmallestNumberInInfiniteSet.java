package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID2336SmallestNumberInInfiniteSet{
    public static void main(String[] args) {
        //Solution solution = new ID2336SmallestNumberInInfiniteSet().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class SmallestInfiniteSet {
        private int min;
        private TreeSet<Integer> set;

    public SmallestInfiniteSet() {
        min = 1;
        set = new TreeSet<>();
    }
    
    public int popSmallest() {
        if (set.isEmpty()){
            return min++;
        }
        return set.pollFirst();
    }
    
    public void addBack(int num) {
        if (num<min){
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
