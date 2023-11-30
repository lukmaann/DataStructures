package Arrays;

public class pascalsTrigle {


    public static void printPascal(int nums){
        for(int i=0;i<nums;i++){
            int n=1;
            int sum=1;
            for(int j=0;j<=i;j++){
                System.out.print(sum);
                sum+=1;
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int []array={1,2,3,4,5,3,2};
        printPascal(5);

        
    }
    
}
