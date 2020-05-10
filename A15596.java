package com.home.backjoon;

import java.util.Scanner;

class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
			ans+=a[i];
		}
        return ans;
    }
}

public class A15596 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= new int[n];
		Test t = new Test();
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(t.sum(a));

	}

}
