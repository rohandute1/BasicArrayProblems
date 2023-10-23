package com.bridglabz;

import java.util.Scanner;

public class PrintOddPositionElements {
    public void oddPositionElementPrinter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        for (int j = 1; j < arr.length; j++){
            if(j % 2 != 0){
                System.out.println("Element at odd position " + j + ": " + arr[j]);
            }
        }
    }
}
