public class reversePairs {

    public static int reversePair(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);

    }

    public static int mergeSort(int arr[], int si, int ei) {
        int cnt = 0;

        if (si < ei) {
            int mid = si + (ei - si) / 2;

            cnt += mergeSort(arr, si, mid);
            cnt += mergeSort(arr, mid + 1, ei);
            cnt += count(arr, si, mid, ei);
            merge(arr, si, mid, ei);

        }

        return cnt;
    }

    public static int count(int arr[], int si, int mid, int ei) {
        int j = mid + 1;

        int cnt = 0;

        for (int i = si; i <= mid; i++) {

            while (j <= ei && arr[i] > 2 * arr[j]) {
                j++;

            }
            cnt += j - (mid + 1);
        }

        return cnt;
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; k < temp.length; k++, i++) {

            arr[i] = temp[k];

        }

    }

    public static void main(String[] args) {

        int array[] = { 1, 3, 2, 3, 1 };

        System.out.println(reversePair(array));

    }

}
