package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size;
        int[] array;

        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Enter size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Out of size.");
            }
        } while (size > 20);

        array = new int[size];

        int i = 0;
        while (i < size) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }

        System.out.print("\n Array element is : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        int min = array[0];
        int index = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }

        System.out.println("Min of array: " + min + ". Position: " + index);

    }
}
