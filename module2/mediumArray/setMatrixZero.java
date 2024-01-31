package module2.mediumArray;

import java.util.ArrayList;

public class setMatrixZero {

    public static int[][] solution(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);

                }

            }
        }

        for(int i=0;i<row.size();i++){
            for(int j=0;j<matrix.length;j++){
                for(int k=0;k<matrix[0].length;k++){
                    matrix[row.get(i)][k]=0;
                }
            }
        }

        for(int i=0;i<col.size();i++){
            for(int j=0;j<matrix.length;j++){
                for(int k=0;k<matrix[0].length;k++){
                    matrix[k][col.get(i)]=0;
                }
            }
        }


        return matrix;

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 0, }, { 4, 5, 6 }, { 7, 8, 9 } };
        printMatrix(solution(matrix));
        ;

    }

}
