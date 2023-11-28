package Arrays.practice;

/**
 * trapRainWater
 */
public class trapRainWater {

    // public static int trapWater(int height[]){
    //     int n=height.length;

    //     int []leftMax=new int[n];
    //     int []rightMax=new int[n];

    //     leftMax[0]=height[0];
    //     rightMax[n-1]=height[n-1];


    //     for(int i=1;i<n;i++){
    //         leftMax[i]=Math.max(height[i],leftMax[i-1]);

    //     }

    //     for(int i=n-2;i>=0;i--){
    //         rightMax[i]=Math.max(height[i],rightMax[i+1]);
    //     }

        

    //     int trappedWater=0;

    //     for(int i=0;i<n;i++){
    //         int waterLevel=Math.min(leftMax[i],rightMax[i]);
    //         trappedWater+=waterLevel-height[i];
    //     }


    //     return trappedWater;

    // }


    public static int trapWater(int array[]){
        int n=array.length;

        int leftMax[]=new int[n];
        int rightMax[]=new int[n];

        leftMax[0]=array[0];
        rightMax[n-1]=array[n-1];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(array[i], leftMax[i-1]);

        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(array[i],rightMax[i+1]);
        }

        int trappedWater=0;

        for(int i=0;i<n;i++){
            int waterLevel=Math.min(rightMax[i],leftMax[i]);

            trappedWater+=waterLevel-array[i];
        }

        return trappedWater;


    }

    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String args[]) {
        int array[] = { 4,2,0,6,3,2,5 };
        System.out.println(trapWater(array));

    }
}