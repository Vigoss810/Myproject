package myproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferedReaderTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader bf=new BufferedReader(new FileReader("src/a.txt"));
String str=null;
while((str=bf.readLine())!=null) {
	System.out.println(str);
}


PrintWriter pw=new PrintWriter(new FileWriter("src/b.txt"));

pw.write(str);

	}

}
