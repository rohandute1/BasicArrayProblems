package com.bridglabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Please select any one program: ");
        System.out.println("1.Program to print the elements of an array\n" +
                "2.Program to find the frequency of each element in the array\n" +
                "3.Program to print the largest element in an array\n" +
                "4.Program to print the smallest element in an array\n" +
                "5.Program to print the elements of an array present on an even position\n" +
                "6.Program to print the elements of an array in reverse order\n" +
                "7.Program to print the elements of an array present on an odd position\n" +
                "8.Program to print the duplicate elements of an array\n" +
                "9.Program to sort the elements of an array in ascending order\n" +
                "10.Find 2nd Largest Number in an Array");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch(option) {
            case 1:
                ArrayElementsPrinter array = new ArrayElementsPrinter();
                array.printElements();
                break;
            case 2:
                CountFrequency freq = new CountFrequency();
                freq.frequencyCounter();
                break;
            case 3:
                PrintLargestElement largest = new PrintLargestElement();
                largest.largestElementPrinter();
                break;
            case 4:
                PrintSmallestElement smallest = new PrintSmallestElement();
                smallest.smallestElementPrinter();
                break;
            case 5:
                PrintEvenPositionElements even = new PrintEvenPositionElements();
                even.evenPositionElementsPrinter();
                break;
            case 6:
                PrintReverseArray reverse = new PrintReverseArray();
                reverse.reverseElement();
                break;
            case 7:
                PrintOddPositionElements odd = new PrintOddPositionElements();
                odd.oddPositionElementPrinter();
                break;
            case 8:
                PrintDuplicateElements duplicate = new PrintDuplicateElements();
                duplicate.duplicateElementPrinter();
            case 9:
                SortToAscendingOrder ascending = new SortToAscendingOrder();
                ascending.ascendingOrderSort();
                break;
            case 10:
                SecondLargestFinder large = new SecondLargestFinder();
                large.findSecondLarge();
                break;
            default:
                System.out.println("Please enter from above options only!");
                break;
        }
    }
}