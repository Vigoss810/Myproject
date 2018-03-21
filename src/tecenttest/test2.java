package tecenttest;

import java.util.Scanner;

public class test2 {
    int n;
    int sum=0;
    Integer[] ints = {};
    int[] j = new int[n];

    public static void main(String[] args) {
        test2 test=new test2();
    }
    public void test2() {
        System.out.println("请输入两个数字:");
        Scanner sc1 = new Scanner(System.in);
        this.n = sc1.nextInt();
        int cost = sc1.nextInt();
        String s = "";
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.println("请输入" + n + "个数字：");
        while (sc.hasNext()) {
            ints[i] = (Integer) sc.nextInt();
            i++;
        }
      sort(ints,0,ints.length-1);
        for (int k : ints) {
            if (i <= n) {
                i++;
                this.j[i] = ints[i].intValue();
            }
        }
        int g=0;
            do {
                sum+=j[g];
                g++;
            }while(sum>=cost);
System.out.println(g-1);
}




   public void sort(Integer[] ints, int left, int right) {
        int temp;
        int i = left;
        int j = right;
        int middle = ints[(int) (i + j) / 2];
        do {
            while (ints[i] > middle && i < right)
                i++;
            while (ints[j] < middle && j > left)
                j--;
            if (i <= j) {
                temp = ints[i];
                ints[i] = ints[j];
                ints[j] = temp;
                i++;
                j--;
            }

        } while (i <= j);
        if (i < right) {
            sort(ints, i, right);
        }
        if (j > left) {
            sort(ints, left, j);
        }
    }

}
