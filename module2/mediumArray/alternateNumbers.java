package module2.mediumArray;

public class alternateNumbers {

    public static int[] solution(int a[]){

        int temp[]= new int[a.length];

        int k=0;
        int l=1;

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                temp[k]=a[i];
                k+=2;
            }

        }

        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                temp[l]=a[i];
                l+=2;
            }
        }
        return temp;

    

    
       
    }

    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,-1,-2,-3};
        printArray(arr);
        printArray(solution(arr));
        
    }
    
}
