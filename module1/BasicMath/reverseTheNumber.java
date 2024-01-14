public class reverseTheNumber {


    public static int reverse(int x){
        long n=0;
        int flag=0;
        

        if(x<0){
            flag=1;
           x= Math.abs(x);
           while(x>0){
            int lastDigit=x%10;
            n= (n*10)+lastDigit;
            x=x/10;
        }

       

        

        }

        while(x>0){
            int lastDigit=x%10;
            n= (n*10)+lastDigit;
            x=x/10;
        }


        if(flag==1){
            n= (int)n*-1;
        }
        

        if(n< Math.pow(-2,30) || n>Math.pow(2, 30)-1){
            return 0;
        }else

       

        return (int)n;
    }

    public static void main(String[] args) {

        System.out.println(reverse(-1563847412));
        
    }
    
}
