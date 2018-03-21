package newtest;

import java.util.ArrayList;
import java.util.Iterator;

public class test5 {
	ArrayList arr = new ArrayList();
	private int k;

	public static void main(String[] args) {
		test5 test = new test5();
		test.doJob(50, 3);
	}

	public void doJob(int n, int m) {
		int i = 0;

		ArrayList arr = new ArrayList();
		String a = new String();
		for (int g = 1; g <= n; g++) {
			arr.add(g);
		}
		for (; n > m; n--) {
			if (n > m) {
				i = i + m - 1;
				if (i >= n) {
					i = i - n;
				}
				k = i % n;
				System.out.println((int) arr.get(k));
				arr.remove(k);
				this.k = k;
			}
		}
		do {
			i = i + m - 1;
			if (i >=n) {
				i = (i - n)%n;
				// k=i%n;
				System.out.println((int) arr.get(i));
				n--;
			}
			arr.remove(i);
		} while (n <= m && n > 0);
	}

}
