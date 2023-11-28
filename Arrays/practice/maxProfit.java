package Arrays.practice;

public class maxProfit {


    public static int maximumProfit(int array[]){
        int n=array.length;
        int min=Integer.MAX_VALUE;
        int minDay=0;

        int max=Integer.MIN_VALUE;
        int maxDay=0;

        for(int i=0;i<n;i++){
            if(array[i]<min){
                min=array[i];
                minDay=i;
            }
        }

        for(int i=minDay;i<n;i++){
            if(array[i]>max){
                max=array[i];
                maxDay=i;
            }

        }

        return max-min;
    }

    public static int maxProfit2(int array[]){
        int n=array.length;
        int buyingPrice =Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<n;i++){
            if(buyingPrice<array[i]){
                int profit=array[i]-buyingPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyingPrice=array[i];
            }
        }
        return maxProfit;
    }

    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String args[]){

        int array[]={7,1,5,3,6,4};
        System.out.println(maxProfit2(array));
    }
    
}
