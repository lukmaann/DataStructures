
public class febonachi {



    public static int[] genrateFebonachi(int n){
        int array[]= new int[n];


        array[0]=0;
        array[1]=1;

        for(int i=2;i<n;i++){
            array[i]=array[i-1]+array[i-2];
        }





        return array;


    }

    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printArray(genrateFebonachi(10));
        
    }
    
}
