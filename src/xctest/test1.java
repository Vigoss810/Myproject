package xctest;

import java.util.Scanner;

//数列的定义如下： 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
public class test1 {
    double sum ;

    private void dojob(double i, int j) {
        if (j > 1) {
            sum += Math.sqrt(i);
            j--;
            dojob(Math.sqrt(i), j);
        } else {
            System.out.println(String.format("%.2f", sum));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextInt();
        int j = sc.nextInt();
        test1 test = new test1();
        test.sum=i;
        test.dojob(i, j);

    }
}
