package com.bridglabz;

import java.util.Scanner;

public class PrintReverseArray {
    public void reverseElement(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        for(int j = arr.length -1; j >= 0; j--){
            System.out.print(arr[j]+", ");
        }
    }
}
