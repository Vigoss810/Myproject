package newtest;

import java.util.Scanner;

public class newTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str1;
    System.out.println("");
    Scanner sc=new Scanner(System.in);
    str1=sc.nextLine();
       System.out.print(sort(str1));
       if(sc!=null)
    	   sc.close();
 
	}

	public static String sort(String str) {
		char tmp;
		StringBuffer str1=new StringBuffer();
		for(int i=0;i<str.length();) {
            tmp=str.charAt(str.length()-i-1);
            str1.append(tmp);
			i++;
		}
		return str1.toString();
	}
}
