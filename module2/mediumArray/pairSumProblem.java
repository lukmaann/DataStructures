package module2.mediumArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class pairSumProblem {

    public static void pairSum(int[] arr, int s) {


    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Write your code here.

    public static void main(String[] args) {
        int arr[] = { 2, -3, 3, 3, -2 };

        for (int[] i : pairSum(arr, 0)) {
            printArray(i);
        }

    }

}
