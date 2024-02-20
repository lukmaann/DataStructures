import java.util.HashMap;

public class topKfrequent {

    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int num : nums) {

            mpp.put(num, mpp.getOrDefault(num, 0) + 1);

        }

        

        return ans;

    }

    public static void main(String[] args) {

    }

}
