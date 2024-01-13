import java.util.HashMap;
import java.util.Map;

public class practice{



    public static int[] highLowFrequency(int nums[]){

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int currentValue=map.get(nums[i]);
                map.put(nums[i],currentValue+1);
            }else{
                map.put(nums[i],1);
            }
        }


        int high=Integer.MIN_VALUE; int highElement=0;
        int low=Integer.MAX_VALUE; int lowElement=0;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){

            int key=entry.getKey();
            int value=entry.getValue();

            if(value<low){
                low=value;
                lowElement=key;

            }

            if(value>high){
                high=value;
                highElement=key;
            }

        }

        return new int[]{highElement,lowElement};
        

    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        int array[]={1,1,2,3,1,2,3,4,};

        printArray(highLowFrequency(array));;



    }
}