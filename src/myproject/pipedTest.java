package myproject;

import java.io.*;

public class pipedTest {
public static void main(String[] args) throws IOException, InterruptedException {
	PipedInputStream pi=new PipedInputStream();
	PipedOutputStream po=new PipedOutputStream(pi);
	Thread t1=new inputTest(pi);
	Thread t2=new outputTest(po);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println("运行完毕");
}

	
	
}
class inputTest extends Thread {
	private PipedInputStream pis;
	public inputTest(PipedInputStream pis){
		this.pis=pis;
	}
	@Override
	public void run() {		
		try {
			int value;
			while((value=pis.read())!=-1) {
			System.out.write(value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pis!=null)
				pis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class outputTest extends Thread{
	private PipedOutputStream pos;
	public outputTest(PipedOutputStream pos) {
		this.pos=pos;
	}
	@Override
	public void run() {
		byte[] b="hello".getBytes();
		try {
			for (byte c : b) {
				pos.write(c);
				pos.flush();
				System.out.println("写线程执行完毕");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pos!=null)
					pos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
