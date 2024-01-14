
public class reverseArray {

    public static void reverse(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int temp = array[si];
        array[si] = array[ei];
        array[ei] = temp;

        reverse(array, si + 1, ei - 1);

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        printArray(array);
        reverse(array, 0, array.length - 1);
        printArray(array);

    }
}