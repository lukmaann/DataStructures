package recursion;

public class recursionbasics {

    public static void printInc(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int facto(int n) {
        if (n == 0) {
            return 1;
        }
        return n * facto(n - 1);
    }

    public static int febonachi(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return (febonachi(n - 1) + febonachi(n - 2));
        // return febonachi(n)+febonachi(n-1);

    }

    public static int sumOfNaturalnumbers(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumOfNaturalnumbers(n - 1);
    }

    public static boolean sortedornot(int array[], int i) {
        if (i == array.length - 1) {
            return true;
        }

        return array[i] < array[i + 1] && sortedornot(array, i + 1);

    }


    public static int firstOccurance(int array[],int target,int index){
        if(index==array.length){
            return -1;
        }
        if(array[index]==target){
            return index;
        }

        return firstOccurance(array, target, index+1);
    }


    public static int lastOccurance(int array[],int target,int index){
        if(index==array.length){
            return -1;
        }

        int isFound=lastOccurance(array, target, index+1);

        if(isFound==-1 && array[index]==target){
            return index;
        }

        return isFound;
    }



    public static double xPowerN(double x ,int n){
        if(n==1){
            return x;
        }

        if(n<0){
           n=Math.abs(n);

           return 1/xPowerN(x, n);
        }
        return xPowerN(x, n-1)*x;
        
    }

    public static double xpowerNOpt(double x,int n){
        if(n==0){
            return 1;
            
        }

        if(n<0){
            n=Math.abs(n);
            
            if(n%2==0){
                return 1/(xpowerNOpt(x, n/2)*xpowerNOpt(x, n/2));
            }else{
                return 1/(x*xpowerNOpt(x, n/2)*xpowerNOpt(x, n/2));
            }

            
        }

        if(n%2==0){
            return xpowerNOpt(x, n/2)*xpowerNOpt(x, n/2);
        }else{
            return x*xpowerNOpt(x, n/2)*xpowerNOpt(x, n/2);
        }
    }

    public static double myPow(double x,int n){
        if(n==0){
            return 1;

        }

        double halfPower=myPow(x, n/2);

        if(n<0){
            x=1/x;
        

            
        }

        if(n%2!=0){
            return x*halfPower*halfPower;
        }

        return halfPower*halfPower;
    }


    
       


    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


   public static int tilingProblem(int n){
    if(n==0 || n==1){
        return 1;
    }
    
    return tilingProblem(n-1)+tilingProblem(n-2);
   }

   public static int dominotrimino(int n){
  if(n<=2){
    return 0;

  }
  if(n==3){
    return 2;
  }

   return dominotrimino(n-1)+dominotrimino(n-2);
   }



   public static void printooccurance(int array[],int key,int n){

    if(n==array.length){
        return ;
    }
    if(array[n]==key){
        System.out.print(n+" ");
    }

     printooccurance(array,key,n+1);
   }

   public static void removeDuplicates(String str,int n,StringBuilder sb, boolean map[]){
    if(n==str.length()){
        System.out.println(sb);
        return;
    }
    char curr=str.charAt(n);

    if(map[curr-'a']==true){
        removeDuplicates(str, n+1, sb, map);
    }else{
        map[curr-'a']=true;
        removeDuplicates(str, n+1, sb.append(curr), map);
    }
   }


   public static int friendsPairing(int n){
    if(n<=2){
        return n;
    }

    return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
   }

   public static int dinomotiles(int n){
    if(n==2){
        return n;
    }
    if(n==1||n==0){
        return 0;
    }

    if(n==3){
        return 5;
    }

    return (dinomotiles(n-1)+dinomotiles(n-2))+dinomotiles(n-2)*2;
   }



   public static void printBinaryString(int n,int lastIndex,String str){
    if(n==0){
        System.out.println(str);
    
        return;
    }

    printBinaryString(n-1, 0, str+"0");
    if(lastIndex==0){
        printBinaryString(n-1, 1, str+"1");
    }
   }

   public static int findlength(String str,int n){
    if(n==str.length()){
        return n;
    }

    return findlength(str, n+1);

   }

   public static void printNumbers(int n){
    
    String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    if(n==0){
        return ;
    }
    int lastnum=n%10;
    printNumbers(n/10);
    System.out.print(digits[lastnum]+" ");


   }

   public static int printLength(String str){
    if(str.length()==0){
        return 0;
    }

    return printLength(str.substring(1))+1;
   }



   public static int countSubstring(String s){
    int count=0;
    for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                count++;
            }
        }
    }

    return count;
   }


    public static void main(String args[]) {
        System.out.println(countSubstring("abcab"));

    }
}