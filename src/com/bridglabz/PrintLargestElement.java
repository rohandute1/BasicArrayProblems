package com.bridglabz;

import java.util.Scanner;

public class PrintLargestElement {
    public void largestElementPrinter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        for(int i = 1;i<=arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest array element in the above array is :" + max);
    }
}
