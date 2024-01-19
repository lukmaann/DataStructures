import java.util.ArrayList;

public class practise1 {

    public static void rotate(int[] nums, int k) {

        int n=nums.length;
        k=k%n;

        reverse(nums, k, n-1);
        reverse(nums,0,k-1);
        reverse(nums, 0, n-1);


    }

    public static void reverse(int array[], int start, int end){

        
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }


    public static ArrayList<Integer> rotateArray(ArrayList<Integer> array,int k){
        ArrayList<Integer> temp= new ArrayList<>();

        for(int i=k;i<array.size();i++){
            temp.add(array.get(i));
        }
        for(int i=0;i<k;i++){
            temp.add(array.get(i));
        }

        return temp;

 
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        ArrayList<Integer> arraylist= new ArrayList<>();

        for(int i=0;i<7;i++){
            arraylist.add(i+1);
        }

        System.out.println(rotateArray(arraylist, 3));
        

    }
}