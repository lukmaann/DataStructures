package Arrays2d;

public class spiralPrint {


    public static void printSpiralMatrix(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while (startcol<=endcol && startrow<=endrow) {

            for(int j=0;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");

            }

            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            for(int i=endrow-1;i>startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }



            

           


            startcol++;
            endcol--;
            startrow++;
            endrow--;
            
        }

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
        int matrix[][]={{1,2,3,4,2},{5,6,4,5,6},{5,6,4,5,6}};

        printMatrix(matrix);

        printSpiralMatrix(matrix);
    }
    
}
