public class practice{

public static void selectionSort(int array[]){
    for(int i=0;i<array.length;i++){
        int min=i;
        for(int j=i;j<array.length;j++){
            if(array[j]<array[min]){
                min=j;
            }
        }

        int temp=array[i];
        array[i]=array[min];
        array[min]=temp;
    }
}


    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public static int subarray(int array[]){
        int count=0;

        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                count++;
            }
        }
        return count;

    
    }
    public static void main(String[] args) {
        int array[]={1,4,2,3,5,2,34,6};
        selectionSort(array);

        printArray(array);
        
    }
}