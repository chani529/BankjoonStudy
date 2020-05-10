package com.home.backjoon;

public class A10996 {

	public static void main(String[] args) {
		int num =3;
		
		for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if (j%2==0) {
						System.out.print('*');
						System.out.println();
					}else {
						System.out.print(" *");
					}
				}
				System.out.println();
		}
	}

}
