package com.home.backjoon;

import java.util.Scanner;

public class A1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double max = 0;
		int n =sc.nextInt();
		double total=0;
		double a[]= new double[n];
		
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
			max = max<a[i]?a[i]:max;
		}
		for (int i = 0; i < n; i++) {
			total+=a[i]/max*100;
		}
		System.out.println(total/n);
		

	}

}
