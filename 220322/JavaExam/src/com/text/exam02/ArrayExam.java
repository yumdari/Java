package com.text.exam02;

import java.util.Arrays;

public class ArrayExam {
	public static void main(String[] argv) {
		int[] a = new int []{1, 2, 3, 4, 5, 6};
		for(int idx = 0; idx<a.length; idx++) {
			System.out.print(a[idx]+" ");
		}
		System.out.println("\n");
		for(int jdx: a) System.out.print(jdx+" ");
		System.out.println("\n");
		System.out.println(Arrays.toString(a));
		int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
		for(int idx = 0; idx<3; idx++) {
			for(int jdx = 0; jdx<3; jdx++)
				System.out.println(b[idx][jdx]);
		}
		for(int idx = 0; idx <b.length; idx++) {
			System.out.println(Arrays.toString(b[idx]));
		}
		int c = 4;
		switch(c) {
		case 1:System.out.println("1입니다.");
		break;
		case 2:System.out.println("2입니다.");
		break;
		case 3:System.out.println("3입니다.");
		break;
		default:System.out.println("4입니다.");
		}
		int k = 0;
		int s = 0;
		while(1) {
			s=s+k;
			k++;
			if(k == 100) {
				conntinue;
			else if(k == 100) break;
			}
		}
		System.out.println("s = " + s);
	}
}
