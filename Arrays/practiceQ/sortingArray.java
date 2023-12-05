package Arrays.practiceQ;

public class sortingArray {

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }

            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
    }

    public static void insertionSort(int array[]) {

        for (int i = 0; i < array.length; i++) {

            int prev = i - 1;
            int curr = array[i];

            while (prev >= 0 && array[prev] < curr) {
                array[prev + 1] = array[prev];
                prev--;
            }

            array[prev + 1] = curr;
        }
    }

    public static void countingSort(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }
        }

        int[] countArr = new int[max + 1];

        for (int i = 0; i < array.length; i++) {
            countArr[array[i]]++;
        }

        int index = 0;

        for (int i = countArr.length - 1; i > 0; i--) {
            while (countArr[i] > 0) {
                array[index] = i;
                countArr[i]--;
                index++;
            }
        }

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        // bubbleSort(array);
        // selectionSort(array);
        countingSort(array);
        printArray(array);
    }
}
