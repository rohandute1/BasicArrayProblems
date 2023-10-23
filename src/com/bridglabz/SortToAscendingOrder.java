package com.bridglabz;

import java.util.Scanner;

public class SortToAscendingOrder {
    public void ascendingOrderSort(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int element = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<element){
                element = arr[i];
                System.out.println(element);

            }
        }
    }
}
