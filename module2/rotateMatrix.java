/**
 * rotateMatrix
 */
public class rotateMatrix {

    public static void rotateMat(int mat[][]) {

        for (int i = 0; i < mat[0].length; i++) {
            int startRow = 0;
            int endRow = mat.length - 1;
            while (startRow < endRow) {
                int temp = mat[startRow][i];
                mat[startRow][i] = mat[endRow][i];
                mat[endRow][i] = temp;

                startRow++;
                endRow--;
            }
        }

        for (int i = 0; i < mat.length; i++) {

            for(int j=i+1;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }

            

        }
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotateMat(mat);
        printMatrix(mat);

    }
}