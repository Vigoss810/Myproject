package xctest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list=new ArrayList();
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        int i=(int)Math.sqrt(list.size());
        int[][] ints=new int[i][i];
        for (int a=0;a<i;a++){
            for (int b=0;b<i;b++){
                ints[a][b]=(int)list.get(a*i+b);
            }
        }

    }
}
