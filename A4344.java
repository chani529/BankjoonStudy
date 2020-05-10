package com.home.backjoon;

import java.util.Scanner;

public class A4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		double[] avg = new double[num];
		double[] avg1 = new double[num];
		for (int i = 0; i < num; i++) {
			int num1=sc.nextInt();
			int[] a = new int[num1];
			for (int j = 0; j < num1; j++) {
				a[j]=sc.nextInt();
				sum+=a[j];
			}
			avg[i]=(double)(sum)/num1;
			sum=0;
			for (int j = 0; j < a.length; j++) {
				if(avg[i]<a[j]) {
					sum++;
				}
			}
			avg1[i]=(double)(sum)/num1;
			sum=0;
		}
		for (int i = 0; i < avg.length; i++) {
			System.out.println(String.format("%.3f", avg1[i]*100)+"%");
		}
	}

}
