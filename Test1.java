
/*
nowcoder有两盒（A、B）乒乓球，有红双喜的、有亚力亚的……现在他需要判别A盒是否包含了B盒中所有的种类，
并且每种球的数量不少于B盒中的数量，该怎么办呢？

输入描述:
输入有多组数据。
每组数据包含两个字符串A、B，代表A盒与B盒中的乒乓球，每个乒乓球用一个大写字母表示，即相同类型的乒乓
球为相同的大写字母。
字符串长度不大于10000。

输出描述:
每一组输入对应一行输出：如果B盒中所有球的类型在A中都有，并且每种球的数量都不大于A，则输出“Yes”；
否则输出“No”。
示例1
输入
ABCDFYE CDE
ABCDGEAS CDECDE
输出
Yes
No
*/
package written_test0724;

import java.util.*;
//乒乓球筐
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.next();
            String b = in.next();
            List<Character> listA = new ArrayList<>();
            List<Character> listB = new ArrayList<>();
            for(int i =0;i<a.length();i++){
                listA.add(a.charAt(i));
            }
            for(int i =0;i<b.length();i++){
                listB.add(b.charAt(i));
            }
            for(int i = 0;i<listB.size();i++){
                if(listA.contains(listB.get(i))){
                    listA.remove(listA.get(listA.indexOf(listB.get(i))));
                    listB.remove(i);
                    i--;
                }
            }
            if(listB.size() == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
