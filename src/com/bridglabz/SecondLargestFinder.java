package com.bridglabz;

public class SecondLargestFinder {
    public void findSecondLarge(){
        int[] arr = {10, 5, 15, 7, 20, 25, 30};

        int firstMax = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("The second largest element in the array is: " + secondMax);
    }
}
