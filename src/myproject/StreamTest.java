package myproject;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class StreamTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos=new PipedOutputStream(pis);
        Thread t1=new inputTest3(pis);
        Thread t2=new outTest(pos);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
		System.out.println("Ö´ÐÐÍê±Ï");
	}

}

class inputTest3 extends Thread{
	private PipedInputStream in;
	public inputTest3(PipedInputStream in) {
		this.in=in;
	}
		@Override
		public void run() {
			int value;
			try {
				while((value=in.read())!=-1)
					System.out.write(value);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(in!=null)
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}

	
}

class outTest extends Thread{
	private PipedOutputStream out;
	public outTest(PipedOutputStream out) {
		this.out=out;
	}
	@Override
	public void run() {
	byte[] ch1= "helloWrold".getBytes();
	try {
		for (byte b : ch1) {
			out.write(b);
			out.flush();
			try {
				outTest.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
	
		e.printStackTrace();
	}finally {
		if(out!=null)
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}
}