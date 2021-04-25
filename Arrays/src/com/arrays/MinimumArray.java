package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumArray {

    public static void main(String args[]){
    	reverseUsingTempVar(new int[]{1, 2, 3, 4, 5});
    }
    
    private static Scanner scanner = new Scanner(System.in);
    public static int readInteger(){
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    public static int[] readElements(int count){
        int [] arrayWithMinValue = new int[count];
        for (int i=0; i<arrayWithMinValue.length; i++){
            arrayWithMinValue[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arrayWithMinValue;
    }

    public static int findMin(int [] array){
        int min = Integer.MAX_VALUE;
        for (int i =0; i<array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    private static void reverseUsingTempVar(int [] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length -1;

        for(int i =0; i <array.length/2; i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex -i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
