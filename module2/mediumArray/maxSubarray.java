package module2.mediumArray;

public class maxSubarray {
    
	public static long maxSubarraySum(int[] arr, int n) {

		int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(sum<0){
                sum=0;
            }
            sum+=arr[i];
            max=Math.max(max, sum);
        }

        return max;

        


		// write your code here
	}


    public static void main(String[] args) {
        int []arr={18 ,-6, -6, -5, 7, 10, 16, -6, -2, 0 };
        System.out.println(maxSubarraySum(arr, arr.length));
        
    }
    
}
