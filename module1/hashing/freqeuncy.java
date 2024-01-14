
/**
 * freqeuncy
 */
public class freqeuncy {


    public static int[] solution(int n, int x, int nums[]){      
        int hash[]= new int[n];

        for(int i=1;i<nums.length;i++){
            hash[nums[i]]++;
        }

        return hash;
    }


    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }



    public static void main(String args[]){

        printArray(solution(6, 9, new int[]{1, 3, 1, 9, 2, 7 }));

    }

    
}