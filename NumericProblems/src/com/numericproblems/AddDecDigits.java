package com.numericproblems;

public class AddDecDigits {
	
	public static String addDecDigits(int number) {
		String num = String.valueOf(number);
		String finalNum = "";
		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			if (i%2 != 0) {
				if (ch == '9') {
					finalNum += "0";
				}else {
					finalNum += String.valueOf(Character.getNumericValue(ch) + 1);
				}
			}else {
				if (ch == '0') {
					finalNum += "9";
				}else {
					finalNum += String.valueOf(Character.getNumericValue(ch) - 1);
				}
			}
		}
		return finalNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDecDigits(78495));
	}

}
