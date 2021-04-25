package com.numericproblems;

public class CheckNumber {

	public static boolean isKaprekar(int number) {

		int square = 0;
		int firstPart = 0;
		int secondPart = 0;
		int sum = 0;

		square = number * number;

		for(int i=String.valueOf(square).length()-1; i>0; i--) {

			firstPart = square / (int)Math.pow(10, i);
			secondPart = square % (int)Math.pow(10, i);

			if(firstPart == 0 || secondPart == 0)
				continue;
			sum = firstPart + secondPart;

			if( sum == number )
				return true;
		}
		return false;
	}  

	public static boolean isArmstrong(int number){
		int temp = number, rem = 0; 
		int calNum = 0;
		while(number>0)  
		{  
			rem =number %10;  
			number=number/10;  
			calNum += Math.pow(rem, 3);  
		} 
		
		return (temp == calNum);
	}

	public static boolean isPrime(int n, int i) {
		if(i < n) {
			if(n % i != 0) {
				return(isPrime(n, ++i));
			} 
			else {
				return false; 
			}
		}
		return true;
	}
	
	public static int largestPrimeFactor(int n) {
		if (n <= 1) {
			return 0;
		} else {
			int div = 2;
			while(div < n) {
				if (n % div != 0) {
					div++;
				}else {
					n = n / div;
					div = 2;
				}
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isArmstrong(153));
		System.out.println(isKaprekar(45));
		System.out.println(isPrime(55,2));
		System.out.println(largestPrimeFactor(120));
	}

}
