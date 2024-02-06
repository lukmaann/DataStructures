import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3Sum
 */
public class threeSum {

    public static List<List<Integer>> threeSumprob(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = i + 2; k < nums.length - 2; k++) {
                    ArrayList<Integer> list = new ArrayList<>();

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        ans.add(list);
                    }

                }

            }
        }

        return (ans);

    }

    public static void main(String[] args) {
   int nums[]={-1,0,1,2,-1,-4};

   System.out.println(threeSumprob(nums));
    }
}