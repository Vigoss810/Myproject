package wytest;


import java.util.Scanner;

/*如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。
        小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列
        输入描述:
        输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。
        第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。


        输出描述:
        如果可以变成等差数列输出"Possible",否则输出"Impossible"。

        输入例子1:
        3
        3 1 2

        输出例子1:
        Possible
        */
public class test2 {
    public int[] getnum() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num ;i++){
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public boolean dojudge() {
        int[] h = getnum();
        boolean b = true;
        sort(h, 0, h.length - 1);
        for (int k = 1; k < h.length - 1; ) {
            if (h[k] - h[k - 1] != h[k + 1] - h[k]) {
                ;
                b = false;
            }
            k++;
        }
        return b;
    }

    public void sort(int[] a, int low, int high) {
        if (low < high) { //如果不加这个判断递归会无法退出导致堆栈溢出异常
            int middle = getMiddle(a, low, high);
            sort(a, 0, middle - 1);          //递归对低子表递归排序
            sort(a, middle + 1, high);        //递归对高子表递归排序
        }
    }

    public int getMiddle(int[] a, int low, int high) {

        int key = a[low];//基准元素，排序中会空出来一个位置
        while (low < high) {
            while (low < high && a[high] >= key) {//从high开始找比基准小的，与low换位置
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= key) {//从low开始找比基准大,放到之前high空出来的位置上
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;//此时low=high 是基准元素的位置，也是空出来的那个位置
        return low;
    }

    public static void main(String[] args) {
        boolean a;
        test2 test = new test2();
        a = test.dojudge();
        if (a) {
            System.out.println("Possible");
        }else {
        System.out.println("Impossible");}

    }
}
