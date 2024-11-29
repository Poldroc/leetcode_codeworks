package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1268SearchSuggestionsSystem {
    public static void main(String[] args) {
        Solution solution = new ID1268SearchSuggestionsSystem().new Solution();
        StringBuilder sb = new StringBuilder();
        // ["mobile","mouse","moneypot","monitor","mousepad"]
        //			"mouse"
        solution.suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"},"mouse");
        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        class Tri {
            Tri[] children;
            boolean isEnd;
            /**
             * 推荐词
             */
            PriorityQueue<String> suggests;

            public Tri() {
                children = new Tri[26];
                // 因为推荐词要最小的三个，所以用最大堆，大的先淘汰
                suggests = new PriorityQueue<>(Comparator.reverseOrder());
            }
        }

        private Tri root;
        private List<List<String>> res;

        private void add(String word) {
            Tri node = root;
            for (char c :word.toCharArray()){
                int idx = c-'a';
                if (node.children[idx]==null){
                    node.children[idx] = new Tri();
                }
                node = node.children[idx];
                // 为字母添加推荐词
                node.suggests.offer(word);
                // 保证3个推荐词
                if (node.suggests.size()>3){
                    node.suggests.poll();
                }
            }
            node.isEnd = true;
        }

        private void startWith(String searchWord){
            Tri node =root;
            boolean exit = true;
            for (char c : searchWord.toCharArray()){
                int idx = c-'a';
                // 不存在，则后续都没有推荐词
                if (!exit || node.children[idx]==null){
                    exit = false;
                    res.add(new ArrayList<>());
                    continue;
                }
                node = node.children[idx];
                List<String> temp = new ArrayList<>();
                while (!node.suggests.isEmpty()){
                    temp.add(node.suggests.poll());
                }
                Collections.reverse(temp);
                res.add(temp);
            }
        }

        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            root = new Tri();
            res = new ArrayList<>();
            for (String w : products){
                add(w);
            }
            startWith(searchWord);
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
