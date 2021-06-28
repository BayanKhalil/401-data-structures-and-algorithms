package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] arr={1,2,3,4};
        int n=9;
        System.out.println("original Array"+ Arrays.toString(arr));
        System.out.println("new Array"+Arrays.toString(insertShiftArray(arr,n)));

    }

    public static int[] insertShiftArray (int[] arr , int n){
        int[] newArray = new int[arr.length+1];
        int left = 0;
        int right=newArray.length-1;

        while (left< right) {

            newArray[left] = arr[left];
            newArray[right] = arr[right-1];
            left++;
            right--;

        }
        newArray[left] = n;

        return newArray;
    }
}
