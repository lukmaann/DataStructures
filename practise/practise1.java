import java.util.HashMap;
import java.util.Map;

public class practise1 {

    public static int longestSubarray(int array[], int num) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];

                if (sum == num) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    public static int maxSubarray(int array[], int k) {
        int max = Integer.MIN_VALUE;
        Map<Long, Integer> mpp = new HashMap<>();
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (sum == k) {
                max = Math.max(max, i + 1);
            }

            long rem = sum - k;

            if (mpp.containsKey(rem)) {
                int len = i - mpp.get(rem);
                Math.max(max, len);
            }

            if (!mpp.containsKey(sum)) {
                mpp.put(sum, i);
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 3, 2 };
        System.out.println(maxSubarray(array, 3));
    }
}