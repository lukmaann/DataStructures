import java.util.*;

public class practice {

    public static int[] highLowFrequency(int nums[]) {

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int currentValue = map.get(nums[i]);
                map.put(nums[i], currentValue + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int high = Integer.MIN_VALUE;
        int highElement = 0;
        int low = Integer.MAX_VALUE;
        int lowElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (value < low) {
                low = value;
                lowElement = key;

            }

            if (value > high) {
                high = value;
                highElement = key;
            }

        }

        return new int[] { highElement, lowElement };

    }


    public static void mergeSort(int array[],int l, int r){
        if(l>=r){
            return;
        }

        int mid=l+(r-l)/2;
        mergeSort(array, l, mid);
        mergeSort(array, mid+1, r);
        merge( array,l,mid, r);

    }

    public static void merge(int arr[], int l,int mid,int r){
        int temp[]= new int[(r-l)+1];

        int i=l;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=r) {

            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
            
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }

        for(k=0, i=l;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }

    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int array[] = { 11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3 };
        printArray(array);
        mergeSort(array, 0, array.length-1);
        printArray(array);


    }
}