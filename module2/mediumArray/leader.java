package module2.mediumArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class leader {

    public static int[] superiorElements(int[] a) {
        int n = a.length;
        int temp[] = new int[n];
        temp[n - 1] = a[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            temp[i] = Math.max(a[i], temp[i + 1]);
        }

        return temp;

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr={187 ,64 ,133 ,62 ,49 ,163 ,50 ,115 ,42 ,65 ,60 ,49 ,32 ,87, 141 ,142, 146, 159 };


        printArray(superiorElements(arr));
        
    }

}
