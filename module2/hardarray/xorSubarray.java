package module2.hardarray;

public class xorSubarray {

    public static int subarraysWithSumK(int[] a, int b) {
        int max = 0;

        int n = a.length;

        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor ^= a[j];

                if (xor == b) {
                    
                }

            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 2 };

        System.out.println(subarraysWithSumK(arr, 2));

    }

}
