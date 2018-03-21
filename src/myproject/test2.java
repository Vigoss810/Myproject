package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {

	public static void main(String[] args) {
		 System.out.println("«Î ‰»Î“ª¥Æ◊÷ƒ∏£∫");
		 String str =null;
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		 try {
			str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// while (!scn.hasNext()) {

		// }

		StringBuffer strbf = new StringBuffer(str);
		StringBuffer str1 = new StringBuffer();
		for (int i = 0; i < strbf.length(); i++) {
			if ('A' <= strbf.charAt(i) && strbf.charAt(i) <= 'Z') {                 
				str1.append(strbf.charAt(i));
				strbf.deleteCharAt(i);
				i--;
			}
			
		}
		System.out.println(strbf.toString()+str1.toString());
	}
}
