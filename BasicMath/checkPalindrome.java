public class checkPalindrome {


    public static boolean check(int x){
        int rev=0;
        int num=x;
        if(x<0){
            return false;
        }

        while(x>0){
            int ld=x%10;
            rev=(rev*10)+ld;
            x/=10;

        }

   

        return rev==num;
    }


    public static void main(String[] args) {

        System.out.println(check(121));
        
    }
    
}
