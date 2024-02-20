package module2.hardarray;

import java.util.HashMap;

public class subarraySum {

    public static int getLongestZeroSumSubarrayLength(int []arr){
        HashMap<Integer,Integer> mpp= new HashMap<>();
        // Write your code here.
        int maxlength=0;
        int n=arr.length;

        int sum=0;

        for(int i=0;i<n;i++){

            sum+=arr[i];

            if(sum==0){
                maxlength=i+1;
            }
            else{
                if(mpp.get(sum)!=null){
                    maxlength=Math.max(maxlength,i-mpp.get(sum));
                }else{
                    mpp.put(sum, i);
                }
            }

        }

      



        return maxlength;
    }

    public static void main(String[] args) {

        int array[]={1, -1, 0, 0, 1};

        System.out.println(getLongestZeroSumSubarrayLength(array));


        
    }
    
}
