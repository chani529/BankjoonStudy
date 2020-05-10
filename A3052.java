package com.home.backjoon;

import java.util.Scanner;

public class A3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[42];
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			b[a[i]%7]++;
		}
		for (int i = 0; i < b.length; i++) {
			if(b[i]!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
