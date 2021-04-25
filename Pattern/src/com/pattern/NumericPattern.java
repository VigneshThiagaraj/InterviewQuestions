package com.pattern;

public class NumericPattern {

	public static void pascals(int n) {
		for (int i = 0; i < n; i++) {
			int number = 1;
			System.out.printf("%" + (n - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}

	}

	public static void diamond(int n) {
		int rows = n;
		for (int i = 1; i <= rows; i++)  {
			rows = n;
			for (int j = 1; j<= rows - i; j++) { 
				System.out.print(" "); 
			} 
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) { 
				System.out.print(l); 
			} 
			System.out.println(); 
		} 
		for (int i = rows -1 ; i >= 1; i--) {
			rows = n - 1;
			for (int j = 0; j<= rows - i; j++) { 
				System.out.print(" "); 
			} 
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamond(4);
	}

}
