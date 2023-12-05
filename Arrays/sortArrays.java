package Arrays;
import java.util.Arrays;


public class sortArrays {


    public static void bubbleSort(int array[]) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
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
            int min = i;
            for (int j = i; j < n - 1; j++) {
                if (array[j] < array[min]) {
                    min = j;

                }

            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }

    }

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prev = i - 1;

            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;

            }

            array[prev + 1] = curr;
        }
    }

    public static void countingSort(int array[]){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        int countArr[]=new int[max+1];

        for(int i=0;i<array.length;i++){
            countArr[array[i]]++;
        }

        int index=0;
        for(int i=0;i<countArr.length;i++){
            while (countArr[i]>0) {
                array[index]=i;
                index++;
                countArr[i]--;
            }
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        int array[] = { 5,4,3,2,1,0 };

        // bubbleSort(array);
        countingSort(array);
        printArray(array);


    }
}