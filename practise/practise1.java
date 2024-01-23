public class practise1{

    public static int lastIndex(int arr[], int idx,int key){
        if(idx==arr.length){
            return -1;
        }

        int isFound=lastIndex(arr,idx+1,key);

        if(isFound==-1 && arr[idx]==key){
            return idx;
        }

        return isFound;
    }


    public static void printBin(int n, int lastIndex, String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printBin(n-1, 0, str+"0");
        if(lastIndex==0){
            printBin(n-1, 1, str+"1");

        }
    }


    public static int missingNumber(int arr[]){
        int n=arr.length+1;

        int sumTobe=(n*(n+1))/2;
        int totalSum=0;

        for(int num : arr){
            totalSum+=num;
        }

        return sumTobe-totalSum;

    

    }

  
    public static void main(String[] args) {

        System.out.println(missingNumber(new int[]{1,2,3,4,5,6,7}));

        
    }
}