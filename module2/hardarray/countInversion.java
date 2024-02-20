import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * countInversion
 */
public class countInversion {

    public static int mergeSort(int array[], int si, int ei) {
        int cnt = 0;

        if (si >= ei) {
            return cnt;
        }

        int mid = (si + ei) / 2;
        cnt += mergeSort(array, si, mid);
        cnt += mergeSort(array, mid + 1, ei);
        cnt += merge(array, si, mid, ei);

        return cnt;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int cnt = 0;

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
                cnt += (mid - i) + 1;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];

        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }

        return cnt;
    }

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));

        }

        return ans;

    }

    public static void main(String[] args) {
        int array[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(mergeOverlappingIntervals(array));
    }

}