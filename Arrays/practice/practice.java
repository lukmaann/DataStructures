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
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")");
            }
            System.out.println();
        }

    }

  

    public static void maxSubArray(int array[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int currentsum = 0;
                


                for (int k = i; k <= j; k++) {
                    
                    // System.out.print(array[k]);
                    currentsum += array[k];
                }
                if (max < currentsum) {
                    max = currentsum;
                }

                System.out.println(currentsum);
            }
            System.out.println();
        }

        System.out.println("Maximum sum of Sub array is : " + max);
    }



    public static int[] subarray(int array[]){
        int temp[]=new int[array.length];
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){

                }
            }
        }


        return temp;
    }


    public static int[] sumOfTargetArray(int array[],int target){
        int ans[]=new int[2];

        for (int i=0;i<=array.length-1;i++){
            for(int j=i+1;j<=array.length-1;j++){
                // System.out.print(i+" "+j);
                if(array[i]+array[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }

        return ans;
    }



    public static int removeElement(int arr[],int val){
        int i=0;

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=val){
                arr[i]=arr[j];
                i++;
            }
        }


        return i;
    }

    public static int maxOfArrayPrefix(int array[]){
        int prefix[]=new int[array.length];

        int max=Integer.MIN_VALUE;

        prefix[0]=array[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        for(int i=0;i<prefix.length;i++){
            if(max<prefix[i]){
                max=prefix[i];
            }
        }

        for(int i=0;i<array.length;i++){

            for(int j=i;j<array.length;j++){

                int currentsum=i==0?prefix[j]:prefix[j]-prefix[i-1];

                if(max<currentsum){
                    max=currentsum;
                }
                
                

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
        int array[] = {1,2,3,4,5};

        System.out.println(maxOfArrayPrefix(array));
        // PrintArray(maxOfArrayPrefix(array));

        SubArrays(array);

        






    }
}