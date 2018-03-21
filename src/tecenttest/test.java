package tecenttest;

public class test {
    public void count(char[] s){
if(s.length==4){
    int a=s[0]-'a'+1;
    int b=s[1]-'a'+1;
    int c=s[2]-'a'+1;
    int d=s[3]-'a';
    int a0=1;
    int b0=25;
    int c0=25*25;
    int d0=25*25*25;
   int index=d*a0+c*b0+b*c0+a*d0;
   System.out.println(index);

}
    }

    public static void main(String[] args) {
        test test1=new test();
char[] a1={'b','a','c','a'};
        test1.count(a1);
    }
}
