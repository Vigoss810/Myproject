package myproject;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.out.println(computeAge(8));
	}
	/*
	 * �ݹ鷽��
	 * 
	 */
public static int computeAge(int n) {
	if(n==1) return 10;
	return computeAge(n-1)+2;
}
}
