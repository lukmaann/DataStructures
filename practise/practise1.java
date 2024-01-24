public class practise1 {

    public static int lastIndex(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return -1;
        }

        int isFound = lastIndex(arr, idx + 1, key);

        if (isFound == -1 && arr[idx] == key) {
            return idx;
        }

        return isFound;
    }

    public static void printBin(int n, int lastIndex, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBin(n - 1, 0, str + "0");
        if (lastIndex == 0) {
            printBin(n - 1, 1, str + "1");

        }
    }

    public static int maximumOnes(int array[]) {

        int max = Integer.MIN_VALUE;
        int c = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1) {
                c++;
            } else {
               max=Math.max(max, c);
                c = 0;
            }

        }

        return max;
    }


    public static boolean checkZeroOnes(String s) {

        int count1=0;
        int count=0;

        int max1=0;

        int max0=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count1++;
            }else{
                count1=0;
            }
            max1=Math.max(max1,count1);
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }else{
                count=0;
            }
            max1=Math.max(max0,count);
        }

        return max1>max0;


    
        
        
    }


    public static boolean segmentofOne(String s){
        int seg=0;

        for(int i=1;i<s.length();i++){
            System.out.println(s.charAt(i));
            if(s.charAt(i)=='1'&&s.charAt(i-1)=='0'){
                seg++;
            }
        }

        System.out.println(seg);

        return seg<=1;
    }

    public static void main(String[] args) {
        String str="1101";

        System.out.println(segmentofOne("1001"));

    }
}