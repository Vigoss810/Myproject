package xctest;
//给定一个整型数组，将数组中所有的“0”移动到末尾，非“0”项保持顺序不变

       // 在原始数组上进行移动操作，勿创建新的数组
import java.util.Scanner;

public class test3 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int[] ins = new int[i];
    int j=0;int tmp=0;
    while (j<i){
        ins[j]=sc.nextInt();
        j++;
    }
    for (int k = 0; k < i; k++) {
        if (ins[k] == 0) {
            for (int f = k+1; f < i; f++) {
                if (ins[f] != 0) {
                    tmp=ins[k];
                    ins[k]=ins[f];
                    ins[f]=tmp;
                    break;
                }
            }
        }
    }
    for (int a :
            ins) {
        System.out.println(a);

    }


}

}
