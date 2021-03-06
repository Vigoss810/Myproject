package wytest;
/*如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。例如: "1","10101","0101010"都是交错01串。
        小易现在有一个01串s,小易想找出一个最长的连续子串,并且这个子串是一个交错01串。小易需要你帮帮忙求出最长的这样的子串的长度是多少。
        输入描述:
        输入包括字符串s,s的长度length(1 ≤ length ≤ 50),字符串中只包含'0'和'1'


        输出描述:
        输出一个整数,表示最长的满足要求的子串长度。

        输入例子1:
        111101111

        输出例子1:
        3
*/
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = 1;
        int sum = 1;
        for (int i = 1; i < s.length(); i++) {//循环遍历数组，找出最大01串
            if (s.charAt(i - 1) != s.charAt(i)) {//如果i-1和i不等，即为一串01串
                sum++;
                if (sum > index) {//判断sum和当前最大01串长度的大小
                    index = sum;//如果sum大则更新index
                }
            } else {
                sum = 1;
            }
        }
        System.out.println(index);

    }
}
