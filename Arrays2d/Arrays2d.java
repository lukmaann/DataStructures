package Arrays2d;

import java.util.*;

import java.util.Scanner;

public class Arrays2d {

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void feedMatrix(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

    }

    public static boolean searchKey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at index (" + i + "," + j + ")");

                    return true;
                }
            }
        }

        System.out.println("no item found");

        return false;
    }

    public static void maxAndMinInMatrix(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("max element is =" + max);
        System.out.println("min element is =" + min);

    }

    public static void printSpiralMatrix(int matrix[][]){
        int startingRow=0;
        int startingCol=0;
        int endingRow=matrix.length-1;
        int endingCol=matrix[0].length-1;

        while (startingRow<=endingRow && startingCol<=endingCol) {

            for(int j=startingCol;j<=endingCol;j++){
                System.out.print(matrix[startingRow][j]+" ");
            }

            for(int i=startingRow+1;i<=endingRow;i++){
                System.out.print(matrix[i][endingCol]+" ");
            }

            for(int j=endingCol-1;j>=startingCol;j--){
                System.out.print(matrix[endingRow][j]+" ");
            }

            for(int i=endingRow-1;i>=startingRow+1;i--){
                System.out.print(matrix[i][startingCol]+" ");

            }


            startingRow++;
            startingCol++;
            endingCol--;
            endingRow--;
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        feedMatrix(matrix);

        // System.out.print("enter key to search=");
        // int key = sc.nextInt();

        System.out.println();

        printSpiralMatrix(matrix);



    }

}
