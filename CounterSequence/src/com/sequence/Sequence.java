package com.sequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); int
		n = Integer.parseInt(br.readLine());

		String output = "";
		String temp = ""; 
		int counter = 1;

		if( n == 1 ) { 
			output = "1"; 
			System.out.println("Final Val " + output); 
		}else{ 
			output = "11"; 
			int i, len = output.length(); 
			for(i = 0; i< len -1 ; i++) {
				if( n == 2) {
					System.out.println("Final Value " + output);
					break;
				}
				//easy way to find count of each elements 
				//counter = output.length() - output.replace(String.valueOf(output.charAt(0)), "").length();

				if(output.charAt(i) == output.charAt(i + 1)) { 
					counter = counter + 1; 			
				} else{ 		
					temp = temp + counter + output.charAt(i);
					counter = 1;
				} 

				if(i == output.length()-2) {
					output = temp + counter + output.charAt(i+1);; 
					counter = 1; 
					len = output.length(); 
					temp = "";
					//System.out.println(output); 
					i = -1; 
					n = n -1;
				}
			} 
		}
	}

}
