public class recursionbasics{


    public static void printInc(int n){


        if(n==1){
            System.out.print(n+" ");
            return;
        }


        printInc(n-1);
        System.out.print(n+" ");
    }


    public static int facto(int n){
        if(n==0){
            return 1;
        }
       return n*facto(n-1);
    }


    public static int febonachi(int n){
      
    }

    public static int sumOfNaturalnumbers(int n){
        if(n==1){
            return 1;
        }

        return n+sumOfNaturalnumbers(n-1);
    }
    public static void main(String args[]){

        // System.out.println(sumOfNaturalnumbers(4));
        febonachi(10);
    }
}