package newtest;

public class newTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=new String("aaabbbcccdddeeefffggg");

System.out.println(drop(str));
	}

	public static String drop(String str) {
	
StringBuffer sb=new StringBuffer();
sb.append(str.charAt(0));
for(int i=0;i<str.length();) {
	if(str.charAt(i)==sb.charAt(sb.length()-1)) {
	i++;
	}else {
		sb.append(str.charAt(i));
		i++;
	}		
}
return sb.toString();
}
}
