package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

                int [] arr = new int [] {1, 2, 3, 4, 5,6};
                int [] arr1 = new int [] {89, 2354, 3546, 23, 10, -923, 823, -12};
                int [] arr2 = new int [] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};


                System.out.println("Original array");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                System.out.println("Arrays in reverse ");
                for (int i = arr.length-1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");

                }
                System.out.println();
                for (int i = arr1.length-1; i >= 0; i--) {
                    System.out.print(arr1[i] + " ");
                }
                System.out.println();
                for (int i = arr2.length-1; i >= 0; i--) {
                    System.out.print(arr2[i] + " ");
                }
            }

        }




