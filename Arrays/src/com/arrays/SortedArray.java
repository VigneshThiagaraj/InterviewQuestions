package com.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SortedArray {
    // write code here
     private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int arrayLength) {
        int [] unSortedArray = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " integers:");
        for (int i =0; i<arrayLength; i++){
            unSortedArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return unSortedArray;
    }

    public static int[] sortUsingTempVar(int [] unSortedArray) {
        int[] sortedArray = Arrays.copyOf(unSortedArray, unSortedArray.length);
        int temp = Integer.MIN_VALUE;
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int [] SortedArray){
        for (int i =0; i<SortedArray.length; i++){
            System.out.println("Element " + i + " contents " + SortedArray[i]);
        }
    }
    
    public static void main(String[] args) {
        printArray(sortUsingTempVar(getIntegers(5)));
    }

}