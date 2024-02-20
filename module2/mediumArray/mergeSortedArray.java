public class mergeSortedArray {


    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        int n=a.length;
        int m=b.length;


        int j=0;

        for(int i)



       
        


    
    }


    public static void inserstionSort(int array[]){

        for(int i=1;i<array.length;i++){

            int curr=array[i];
            int prev=i-1;

            while (prev>=0 && array[prev]>curr) {

                array[prev+1]=array[prev];

                prev--;
                
            }

            array[prev+1]=curr;
        }

    }


    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int array[]={3,4,5,2,1,2,3,5,6,2};
        printArray(array);
        inserstionSort(array);
        printArray(array);
        
    }
}