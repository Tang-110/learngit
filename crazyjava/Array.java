package crazyjava;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[];
        arr = new int[]{1, 9, 6, 8, 10, 2};
        Arrays.parallelSort(arr, 1, 5);
        System.out.println(Arrays.toString(arr));
    }
}
