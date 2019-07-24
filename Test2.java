/*
输入描述:
先输入字典中单词的个数n，再输入n个单词作为字典单词。
再输入一个单词，查找其在字典中兄弟单词的个数m
再输入数字k

输出描述:
根据输入，输出查找到的兄弟单词的个数m
然后输出查找到的兄弟单词的第k个单词。

示例1
输入
3	abc	bca	cab	abc	1
输出
2	bca*/
package written_test0724;

import java.util.*;
//查找兄弟单词
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String[] strs = new String[n];
            String[] tmp = new String[n];
            for(int i=0; i<n; i++){
                strs[i] = in.next();
                char[] t = strs[i].toCharArray();
                Arrays.sort(t);
                tmp[i] = String.valueOf(t);
            }
            String str = in.next();
            char[] t = str.toCharArray();
            Arrays.sort(t);
            String str1 = String.valueOf(t);
            int m = in.nextInt();
            int count = 0;
            List<String> list = new ArrayList<>();
            for(int i=0;i<n; i++){
                if(str1.equals(tmp[i]) && !str.equals(strs[i])){
                    count++;
                    list.add(strs[i]);
                }
            }
            Collections.sort(list);
            System.out.println(count);
            if(m <= list.size()){
                System.out.println(list.get(m-1));
            }
        }
    }
}

