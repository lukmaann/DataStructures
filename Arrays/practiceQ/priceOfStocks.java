package Arrays.practiceQ;

public class priceOfStocks {

    public static void getMaximumProfit(int array[]){
        int min=array[0];
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }

            if(max<array[i]-min){
                max=array[i]-min;
            }
        }

        System.out.println(max);
    }


    public static void main(String[] args) {

        int prices[]={1,4,9,2,3,5,7,3,4,6,8,2,1,2,3,20,100};

        getMaximumProfit(prices);
        
    }
    
}
