package newtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class newTest2 {
	static int a,b,c,d,e,f,g,i,h,k;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String str=new String("91254782354987012345978");
countNum(str);
//FileReader fr=new FileReader("src/a.txt");	
//while((Integer)(fr.read())!=null);{

//}
		

	}

	public static void countNum(String str1) {
		char tmp = 0;
for(int j=0;j<str1.length();) {
	tmp=str1.charAt(str1.length()-j-1);
	j++;

			switch (tmp) {
			case '0':
				a++;
				break;
			case '1':
				b++;
				break;
			case '2':
				c++;
				break;
			case '3':
				d++;
				break;
			case '4':
				e++;
				break;
			case '5':
				f++;
				break;
			case '6':
				g++;
				break;
			case '7':
				h++;
				break;
			case '8':
				i++;
				break;
			case '9':
				k++;
				break;

			}
	  		}  System.out.println("0有"+a+"个");
		System.out.println("1有"+b+"个");
		System.out.println("2有"+c+"个");
		System.out.println("3有"+d+"个");
		System.out.println("4有"+e+"个");
		System.out.println("5有"+f+"个");
		System.out.println("6有"+g+"个");
		System.out.println("7有"+h+"个");
		System.out.println("8有"+i+"个");
		System.out.println("9有"+k+"个");

	}
	}
