package com.bridglabz;

import java.util.Scanner;

public class PrintSmallestElement {
    public void smallestElementPrinter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }

        int min = arr[0];

        for(int i = 1; i <arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest array element in the above array is :" + min);
    }
}
