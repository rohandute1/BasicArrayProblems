package com.bridglabz;

import java.util.Scanner;

public class ArrayElementsPrinter {
    public void printElements(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }

        for(int ar : arr){
            System.out.println(ar);
        }
    }
}
