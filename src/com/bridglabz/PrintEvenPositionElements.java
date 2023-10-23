package com.bridglabz;

import java.util.Scanner;

public class PrintEvenPositionElements {
    public void evenPositionElementsPrinter(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Element at even position " + i + ": " + arr[i]);
            }
        }
    }
}
