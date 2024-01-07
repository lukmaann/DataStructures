package divideAndConquer;

public class QuickSort {

    public static void solution(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pi = partition(array, si, ei);

        solution(array, si, pi - 1);
        solution(array, pi + 1, ei);
    }

    public static int partition(int array[], int si, int ei) {
        int pivot = array[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        i++;
        int temp = array[ei];
        array[ei] = array[i];
        array[i] = temp;

        return i;
    }

    public static void main(String args[]) {

        int array[] = { 1, 2, 3, 5, 2, 2, 2, 4, 5, 7, 8, 9, 2, 1, 9 };

        MergeSort.printArray(array);

        solution(array, 0, array.length - 1);
        MergeSort.printArray(array);

    }
}