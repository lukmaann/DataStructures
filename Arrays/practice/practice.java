package Arrays.practice;

public class practice {

    public static int BinarySearch(int array[], int key) {

        int start = 0, end = array.length;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) {
                return mid;
            }
            if (key < array[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1;

    }


    public static void ReverseTheArray(int array[]){
        int start=0,end=array.length-1;

        while (start<end) {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;

            start++;
            end--;
            
        }
        System.out.println();
    }


    public static void PrintArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String args[]) {
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = i;

        }

        PrintArray(array);

        ReverseTheArray(array);
        PrintArray(array);

        

    }
}