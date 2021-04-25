package com.pattern;

public class StarPattern {

	public static void pyramidPattern(int n) {
		//loop for number of rows(n) 
		for (int i=0; i<n; i++) { 
			// loop to print spaces in a row
			for (int j=n-i; j>1; j--) { 
				System.out.print(" "); 
			}  
			// loop to print stars in a row
			for (int j=0; j<=i; j++ ) { 
				System.out.print("* "); 
			} 
			System.out.println(); 
		} 
	} 

	public static void rightTriangle(int n) { 
		int i, j;  
		for(i=0; i<n; i++) { 
			for(j=2*(n-i); j>=0; j--) {           
				System.out.print(" ");
			} 
			for(j=0; j<=i; j++) {       
				System.out.print("* "); 
			}           
			System.out.println(); 
		} 
	} 

	public static void leftTriangle(int n) { 
		int i, j;  
		for(i=0; i<n; i++)  { 
			for(j=2*(n-i); j>=0; j--) {
				System.out.print(" "); 
			} 
			for(j=0; j<=i; j++) {       
				System.out.print("* "); 
			}           
			System.out.println(); 
		} 
	} 

	public static void diamondStars(int n) {
		int i, j, space = 1;
		space = n - 1;
		for (j = 1; j<= n; j++) {
			for (i = 1; i<= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j<= n - 1; j++) {
			for (i = 1; i<= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (i = 1; i<= 2 * (n - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void pascals(int n) {

		for (int i= 0; i<= n-1 ; i++) {
			for (int j=0; j<=i; j++) { 
				System.out.print("*"+ " "); 
			} System.out.println(""); 
		}

		for (int i=n-1; i>=0; i--) {
			for(int j=0; j <= i-1;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}
	}

	public static void sandGlass(int n) {
		for (int i= 0; i<= n-1 ; i++) {
			for (int j=0; j <i; j++) {
				System.out.print(" ");
			}
			for (int k=i; k<=n-1; k++) { 
				System.out.print("*" + " "); 
			}
			System.out.println(""); 
		} 
		for (int i= n-1; i>= 0; i--) {
			for (int j=0; j< i ;j++) {
				System.out.print(" ");
			}
			for (int k=i; k<=n-1; k++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
