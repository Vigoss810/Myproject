package newtest;

import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class java8test {
public static void main(String[] args) {
	Thread tht=new ThreadTest();
	Thread DeamonThread=new Thread();
	DeamonThread.setDaemon(true);
	System.out.println(DeamonThread.isDaemon());
tht.start();

}
}
class  ThreadTest extends Thread{
	String str=new String("abcdefg");
	@Override
	public void run() {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
