package ppp;

public class practice {



    public static int removeElements(int array[],int val){
        int j=0;

        for(int i=0;i<array.length;i++){
            if(array[i]!=val){
                array[j]=array[i];
                j++;
            }
        }



        return j;
    }


    public static int[] plusOne(int array[]){
        for(int i=array.length-1;i>=0;i--){
            if(array[i]<9){
                array[i]++;
                return array;
            }
            array[i]=0;
        }
        array=new int[array.length+1];
        array[0]=1;
        return array;

    }

    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }


    public static int trapWater(int height[]){
        int n=height.length;

        int []leftmax=new int[n];
        int []rightmax=new int[n];

        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];

        for(int i=0;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);


        }

        int trappedWater=0;

        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater+=waterLevel-height[i];
        }

        return trappedWater;
    }
    

    public static int[] spiralOrder(int[][] matrix) {

        int n=matrix.length;
        int m=matrix[0].length;

        int array[]=new int[n*m];
        int k=0;
        
        int startrow=0;
        int startcol=0;
        int endcol=matrix.length-1;
        int endrow=matrix[0].length-1;
        


        while(startrow<=endrow && startcol<=endcol){
            for(int j=0;j<=endcol;j++){
                array[k]=matrix[startrow][j];
                
                k++;
            }

            for(int i=startrow+1;i<=endrow;i++){
                array[k]=matrix[i][endcol];
                k++;

            }
            for(int j=endcol-1;j>=startcol;j--){
                array[k]=matrix[endrow][j];
                k++;
            }

            for(int i=endrow-1;i>=startrow+1;i--){
                array[k]=matrix[i][startcol];
            }
        }


        return array;


        
    }


    public static int maxTrapwater(int height[]){
       
        int n=height.length;

        int left=0;
        int right=n-1;

        int maxarea=Integer.MIN_VALUE;
        while(left<right){
            int width=right-left;
            int barHeights=Math.min(height[left],height[right]);

            int currentarea=width*barHeights;

            maxarea=Math.max(currentarea, maxarea);

            if(height[left]<height[right]){
                left++;
            }else if(height[left]>height[right]){
                right--;
            }else{
                left++;
                right--;
            }


        }


        return maxarea;

    }




    public static void main(String[] args) {
        int []array={1,1};
        int []array2={1,8,6,2,5,4,8,3,7};
        int []array3={4,3,2,1,4};

        System.out.println(maxTrapwater(array3));



    }
}
