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
	  		}  System.out.println("0��"+a+"��");
		System.out.println("1��"+b+"��");
		System.out.println("2��"+c+"��");
		System.out.println("3��"+d+"��");
		System.out.println("4��"+e+"��");
		System.out.println("5��"+f+"��");
		System.out.println("6��"+g+"��");
		System.out.println("7��"+h+"��");
		System.out.println("8��"+i+"��");
		System.out.println("9��"+k+"��");

	}
	}
