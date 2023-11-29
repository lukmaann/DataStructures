package Arrays;

public class trapRain {

    public static int trapWater(int array[]) {
        int n = array.length;

        int leftMax[] = new int[n];
        int rightmax[] = new int[n];

        leftMax[0] = array[0];
        rightmax[n - 1] = array[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(array[i], leftMax[i - 1]);
        }

        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(array[i], rightmax[i+1]);
        }

        int trappedwater=0;


        for(int i=0;i<n;i++){
            int waterLevel=Math.min(rightmax[i], leftMax[i]);
            trappedwater=waterLevel+array[i];

        }

        return trappedwater;
    }

    public static void main(String args[]) {
        int height[]={2,1,2,3,1,3,5,6};
        System.out.println(trapWater(height));
    }

}
