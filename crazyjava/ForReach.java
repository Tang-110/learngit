package crazyjava;

import java.util.Arrays;

public class ForReach {
    public static void main(String[] args) {
        //String[] name={"xiaoming","xiaohong","zhangsan"};
        //int[] id = {2, 3, 1, 20, 30, 10, 9, 4};
        long longArray[]=new long[20000];
        Arrays.parallelSort(longArray, 0, 8);
        Arrays.sort(longArray);
        for (long i : longArray) {
            System.out.println(i);
        }
    }
}
