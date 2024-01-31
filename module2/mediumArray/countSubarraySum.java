package module2.mediumArray;

import java.util.HashMap;

public class countSubarraySum {


    public static int solution(int nums[], int k){

        int cnt=0;

        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }


    public static int count(int array[]){

    




        return 0;
    }



    public static void main(String[] args) {

        int a[]={1,1,1};
        System.out.println(solution(a, 2));
        
    }
    
}
