package module2.mediumArray;

import java.util.*;

public  class fourSumProblem {
     public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ansSet= new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                HashSet<Integer> set=new HashSet<>();
                for(int k=i+2;k<nums.length;k++){
                    int next=target-(nums[i]+nums[j]+nums[k]);

                    if(set.contains(next)){
                        List<Integer> temp= new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],next));
                        Collections.sort(temp);
                        ansSet.add(temp);
                    }

                    set.add(nums[k]);


                }
            }
        }

        List<List<Integer>> list= new ArrayList<>(ansSet);
        return list;


        





        
        
    }



    public static void main(String[] args) {
        int nums[]={1,2,3,4,1,2,3,4,0,0,0,0};

        System.out.println(fourSum(nums,4));
        
    }
    
}
