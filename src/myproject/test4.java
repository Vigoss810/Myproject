package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test4 {
	static String s="";
	static Scanner sc=new Scanner(System.in);
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入要排序的数组：");
		Integer[] ints = {};
		while(sc.hasNext()) {			
			ints[i]=(Integer)sc.nextInt();
			i++;
		}
		
		test4 test = new test4();
		test.quicksort(ints, 0, ints.length - 1);
		for (int i : ints) {
			System.out.println(i);
		}
	}


	

		 
	


	
	public void quicksort(Integer[] ints, int left, int right) {
		int temp;
		int i = left;
		int j = right;
		int middle = ints[(int) (i + j) / 2];
		do {
			while (ints[i]>middle && i < right)
				i++;
			while (ints[j]<middle && j > left)
				j--;
			if (i <= j) {
				temp = ints[i];
				ints[i] = ints[j];
				ints[j] = temp;
				i++;
				j--;
			}

		} while (i <= j);
		if (i < right) {
			quicksort(ints, i, right);
		}
		if (j > left) {
			quicksort(ints, left, j);
		}
	}

}
