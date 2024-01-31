package module2.mediumArray;

public class spiralMatrix {
    public static int[] solution(int matrix[][]) {
        int m = matrix.length;
        int n = matrix[0].length;

        int ans[] = new int[n * m];

        int startRow = 0;
        int endRow = matrix.length - 1;

        int startCol = 0;
        int endCol = matrix[0].length - 1;


        int k=0;

        while (startRow <= endRow && startCol <= endCol) {

            for(int j=startCol;j<=endCol;j++){
                ans[k]=matrix[startRow][j];
                k++;

            }

            for(int i=startRow+1;i<=endRow;i++){
                ans[k]=matrix[i][endCol];
                k++;
            }


            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                ans[k]=matrix[endRow][j];
                k++;
            }

    
            for(int i=endRow-1;i>startRow;i--){
                if(startCol==endCol){
                    break;
                }
                ans[k]=matrix[i][startCol];
                k++;
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }

        return ans;
    }


    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            System.out.println();

        }
    }


    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

        printMatrix(matrix);

        printArray(solution(matrix));
    }

}
