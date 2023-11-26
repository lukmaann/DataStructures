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

    public static void ReverseTheArray(int array[]) {
        int start = 0, end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;

        }
        System.out.println();
    }

    public static void PairTheArray(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")");
            }
            System.out.println();

        }

    }

    public static int removeDuplicate(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;

    }

    public static int removeElement(int nums[], int val) {

        int k = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }

        return k;

    }

    public static int  maxSubarrayPrefix(int array[]){
        int max=0;
        int prefix[]=new int [array.length];
        prefix[0]=array[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                int currentsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(max<currentsum){
                    max=currentsum;
                }

              
                System.out.println();
            }
            System.out.println();
        }

        return max;

    }


    public static int  kadanesMaxSuArray(int array[]){
        int max=Integer.MIN_VALUE;
        int currentsum=0;

        for(int i=0;i<array.length;i++){
            currentsum+=array[i];
            if(currentsum<0){
                currentsum=0;
            }
            if(max<currentsum){
                max=currentsum;
            }
        }



        return max;
    }

    public static void PrintArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        int array[] = { -2,-3,4,-1,-2,1,5,-3};

        System.out.println(maxSubarrayPrefix(array));

        

    }
}