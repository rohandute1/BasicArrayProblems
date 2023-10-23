package com.bridglabz;

import java.util.Scanner;

public class CountFrequency {
    public void frequencyCounter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (arr[j] == element) {
                    count++;
                }
            }

            if (count == 0) {
                count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == element) {
                        count++;
                    }
                }
                System.out.println("Element " + element + " occurs " + count + " times");
            }
        }
    }
}
