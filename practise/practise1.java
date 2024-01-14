public class practise1 {

    public static void mergeSort(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    public static void merge(int arr[], int l, int mid, int r) {
        int temp[] = new int[(r - l) + 1];

        int i = l;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }

        while( i<=mid){
            temp[k++]=arr[i++];
            

        }

        while(j<=r){
            temp[k++]=arr[j++];
        }

        for(k=0,i=l;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }

    }


    public static void bubbleSort(int array[],int i){
        if(i==array.length-2){
            return;
        }


       for(int j=i;j<array.length-1;j++){
        if(array[j]>array[j+1]){
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
        }

       }
        bubbleSort(array, i+1);

    
    }


    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[]= {1,3,1,3,5,21,4,6,7,8};
        printArray(arr);
        bubbleSort(arr, 0);
        printArray(arr);

      

        
    }

}
