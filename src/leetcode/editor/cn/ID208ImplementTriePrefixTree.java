package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID208ImplementTriePrefixTree {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Trie {
        private Trie[] children;
        // 该结点是否是一个串的结束
        private boolean isEnd;

        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }

        public void insert(String word) {
            // 从跟节点开始匹配
            Trie node = this;
            for (int i = 0;i<word.length();i++){
                char ch = word.charAt(i);
                int index = ch - 'a';
                // 往下找，找到对应的字母节点为空的时候开辟新节点
                if (node.children[index] == null){
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            // 终止，表示word在这里停止
            node.isEnd = true;
        }

        public boolean search(String word) {
            Trie node = searchPrefix(word);
            return node != null && node.isEnd;
        }

        public boolean startsWith(String prefix) {
            return searchPrefix(prefix) != null;
        }
        private Trie searchPrefix(String prefix) {
            Trie node = this;
            for (int i = 0; i < prefix.length(); i++) {
                char ch = prefix.charAt(i);
                int index = ch - 'a';
                if (node.children[index] == null) {
                    return null;
                }
                node = node.children[index];
            }
            return node;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
