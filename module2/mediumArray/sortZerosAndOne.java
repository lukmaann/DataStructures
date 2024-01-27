package module2.mediumArray;

/**
 * sortZerosAndOne
 */
public class sortZerosAndOne {


    public static void bruteForce(int array[]){
        int k=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                int temp=array[i];
                array[i]=array[k];
                array[k]=temp;
                k++;
            }
        }

        for(int i=k;i<array.length;i++){
            if(array[i]==1){
                int temp=array[i];
                array[i]=array[k];
                array[k]=temp;
                k++;
            }
        }

    }

    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


public static void main(String[] args) {

    int array[]={2,0,1,2,0,1};
    printArray(array); 
    bruteForce(array);
    printArray(array);
    
    
}

    
}