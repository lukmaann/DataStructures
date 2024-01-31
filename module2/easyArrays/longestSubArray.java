package module2.easyArrays;

import java.util.HashMap;
import java.util.Map;

class longestSubarray {

    public static int BruteForce(int array[], int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += array[l];
                }

                if (sum == k)
                    max = Math.max(max, j - i + 1);
            }
        }
        return max;

    }

    public static int BruteForce1(int array[], int key) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];

                if (sum == key) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    public static int better(int array[], int key) {
        int max = Integer.MIN_VALUE;
        long sum = 0;

        Map<Long, Integer> mpp = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (sum == key) {
                max = Math.max(max, i + 1);
            }

            long rem = sum - key;

            if (mpp.containsKey(rem)) {
                int len = i - mpp.get(rem);
                max = Math.max(len, max);
            }

            if (!mpp.containsKey(sum)) {
                mpp.put(sum, i);
            }

        }

        return max;
    }

    public static int optimal(int array[], int key) {
        int n = array.length;
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int sum = array[0];

        while (right < n) {

            while (left < right && sum > key) {
                sum -= array[left];
                left++;

            }

            if (sum == key) {
                max = Math.max(max, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += array[right];
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int array[] = { 1, 1, 1, 2, 3, 3 };

        System.out.println(better(array, 3));
    }
}