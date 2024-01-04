public class practice {

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int subarray(int array[]) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                count++;
            }
        }
        return count;

    }

    public static int maxpro(int nums[]) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        int pref=1;int suff=1;

       for(int i=0;i<n;i++){
       

        
        
       }

        
        return max;

    }

    public static int maxSubArraySum(int nums[]){
        int n=nums.length;
        int max=Integer.MIN_VALUE;

        int pref=0;
        for(int i=0;i<n;i++){
            if(pref<0) pref=0;

            pref+=nums[i];
            max=Math.max(pref,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int array[] = { 0, 2 };
        System.out.println(maxSubArraySum(array));

    }
}