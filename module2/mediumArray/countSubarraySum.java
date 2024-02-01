package module2.mediumArray;

import java.util.*;

public class countSubarraySum {

    public static int solution(int nums[], int k) {

        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int count(int array[], int k) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        int preSum = 0;
        int cnt = 0;
        mpp.put(preSum, 1);
        for (int i = 0; i < array.length; i++) {
            preSum += array[i];
            int rem = preSum - k;
            cnt += mpp.getOrDefault(rem, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);

        }

        return cnt;

    }

    public static void main(String[] args) {

        int a[] = { 1, 1, 1 };
        System.out.println(solution(a, 2));

    }

}
