package com.home.backjoon;

import java.util.Scanner;

public class A8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] total=new int[num];
		int a=1;
		for (int i = 0; i < num; i++) {
			String s = sc.next();
			char[] ch = s.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if(ch[j]=='O') {
					total[i]+=a;
					a++;
				}else if(ch[j]=='X') {
					a=1;
				}
			}
			a=1;
		}
		for (int i = 0; i < total.length; i++) {
			System.out.println(total[i]);
		}
	
	}

}
