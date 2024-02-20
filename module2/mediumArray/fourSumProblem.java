package module2.mediumArray;

import java.util.*;

public class fourSumProblem {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {

                if (j > i+ 1 && nums[j] == nums[j - 1])
                    continue;

                int k = j + 1;
                int l = n - 1;

                while (k < l) {

                    long sum = nums[i] ;
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];

                    if (sum < target) {
                        k++;

                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        list.add(temp);
                        k++;
                        l--;
                    }

                }

                while (k < l && nums[k] == nums[k - 1]) {
                    k++;

                }

                while (k < l && nums[l] == nums[l + 1]) {
                    l--;
                }

            }
        }

        return list;

    }

    public static void main(String[] args) {
        int nums[] = { 1,0,-1,0,-2,2 };

        System.out.println(fourSum(nums, 0));

    }

}
