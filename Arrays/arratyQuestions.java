package Arrays;

import java.util.*;

public class arratyQuestions {

    public static void subArrays(int array[]) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k]);

                }
                total++;
                System.out.println();
            }

            System.out.println();

        }

        System.out.println("total arrays are :=" + total);

    }

    public static int[] plusOne(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                return array;
            }
            array[i] = 0;
        }
        array = new int[array.length + 1];
        array[0] = 1;
        return array;

    }

    public static int thirdHighest(int array[]) {
        int first = 0;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                first = array[i];
            }
        }

        for( int i=0;i<array.length;i++){
            if(array[i]>sec && array[i]<first){
                sec=array[i];
            }
        }

        for( int i=0;i<array.length;i++){
            if(array[i]>third && array[i]<sec){
                third=array[i];
            }
        }

        if(array.length<3 || third==Integer.MIN_VALUE){
            return first;
        }

        return third;
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String args[]) {

        int array[] = { 1, 1,2};
        System.out.println(thirdHighest(array));

    }

}
