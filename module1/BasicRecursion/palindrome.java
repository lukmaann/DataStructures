public class palindrome{

    public static boolean check(String str,int i){
        int n=str.length()-1;
        if(i>=n/2){
            return true;
        }
        
        if(str.charAt(i)!=str.charAt(n-i)){
            return false;
        }

        return check(str, i+1);

    }

    public static int fib(int n){
        if(n==0|| n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }




    public static boolean palin(String str){
        int i=0;
        int n=str.length();

        while (i<=n/2) {
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
            i++;
            
        }

        return true;


    }
    public static void main(String[] args) {

        String str= "racecare";

        System.out.println(palin("racecar"));
        
    }
}