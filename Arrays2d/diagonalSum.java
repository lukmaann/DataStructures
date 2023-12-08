package Arrays2d;

public class diagonalSum {

    public static int calculateDiagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }

            }
        }
        return sum;
    }

    public static int calculateDiagonalSumOPTIMISED(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum;
    }


    public static void printSpiralMatrix(int matrix[][]){
        int startcol=0;
        int endcol=matrix[0].length-1;
        int startrow=0;
        int endrow=matrix.length-1;

        while(startcol<=endcol && startrow<=endrow){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(matrix[endrow][j]+" ");
            }

            for(int i=endrow-1;i>=startrow+1;i--){

                System.out.print(matrix[i][startcol]+" ");

            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }


    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int matrix2[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // System.out.println(calculateDiagonalSumOPTIMISED(matrix2));
        printSpiralMatrix(matrix2);
    }

}
