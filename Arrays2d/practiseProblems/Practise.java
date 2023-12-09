package Arrays2d.practiseProblems;

public class Practise {


    public static int calculte7(int matrix[][]){
        int count=0;


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }

        return count;
    }
    

    public static int sumOfSecondLine(int matrix[][]){
        int sum=0;

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }


        //optimised
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }

        return sum;
    }


    public static int[][] tranposeOfMatrix(int matrix[][]){
        int m=matrix[0].length;
        int n=matrix.length;

        int newMatrix[][]=new int[m][n];

        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[0].length;j++){
                newMatrix[i][j]=matrix[j][i];
            }
        }

        return newMatrix;

    }



    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3},{4,5,6}};

            printMatrix(matrix);
            printMatrix(tranposeOfMatrix(matrix));;
       


    }
}
