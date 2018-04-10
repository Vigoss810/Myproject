package xctest;

//春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，他是这样定义的： “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。 现在要求输出所有在m和n范围内的水仙花数。

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=new String();
        ArrayList list=new ArrayList();
        ArrayList list1 = new ArrayList();
        while (sc.hasNextLine()&&sc.nextLine()!=null) {
            list1.add(sc.nextInt());
            list1.add(sc.nextInt());
        }
        sc.close();
        for (int k=0;k<list1.size();){
            list.add(list1.get(k));
            list.add(list1.get(k+1));
            dojob(list, (int)list.get(0), (int)list.get(1));
            if (list.size() == 0) {
                System.out.println("no");
            }else {
                System.out.println(list);
            }
            list.clear();
            k=k+2;
        }


    }


    public static ArrayList dojob(ArrayList list, int i, int x) {//判断是否为水仙花数
        list.clear();
        for (; i <= x; i++) {
            if (Math.pow((i / 100), 3) + Math.pow(((i / 10)%10), 3) + Math.pow((i % 10), 3) == i) {
                list.add(i);
            }
        }
        return list;
    }
}
