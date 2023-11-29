package Arrays;
import java.util.*;

public class checkDuplicates {

    public static boolean areDuplicate(int array[]){
        java.util.Arrays.sort(array);

        for(int i=0;i<array.length-1;i++){
            if(array[i]==array[i+1]){
                return true;
            }
        }

        return false;

    }

    public static int firstIndexOfDuplicate(int array[]){
        int n=array.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    return i;
                }
            }
        }
        return -1;
    }



    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }



    public static void main(String[] args) {
        int []array={'a','b','c','d','d'};

        System.out.println(firstIndexOfDuplicate(array));



    }
}
