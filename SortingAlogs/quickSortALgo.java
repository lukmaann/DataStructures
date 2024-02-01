
class quickSortALgo {
    public static void quickSort(int array[], int si, int ei) {
        if (si < ei) {

            int pi = partition(array, si, ei);
            quickSort(array, si, pi - 1);
            quickSort(array, pi + 1, ei);

        }
    }

    public static int partition(int array[], int si, int ei) {
        int pivot = array[ei];

        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[ei];
        array[ei] = array[i];
        array[i] = temp;

        return i;

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 9, 8, 7, 6, 4, 2, 4, 1, 3, 0 };
        printArray(array);
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

}