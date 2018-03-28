package wytest;

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int index = n - k;int sum=0;
        for (;index>=0;index--){
            sum=sum+index;
        }
        if (n/k>=k){
            sum+=1;
        }
        System.out.println(sum);
    }
}