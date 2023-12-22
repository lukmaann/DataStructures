package ppp;

import java.util.Arrays;
/**
 * practice
 */
public class practice {

    public static int[] plusone(int array[]) {
        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] < 9) {
                array[i]=array[i]+1;
                return array;
            }
            array[i] = 0;

        }

        array = new int[array.length + 1];
        array[0] = 1;
        return array;
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    public static int trapwater(int array[]) {
        int n = array.length;

        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0] = array[0];
        rightmax[n - 1] = array[n - 1];

        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], array[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], array[i]);
        }

        int trapwater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightmax[i], leftmax[i]);
            trapwater += waterLevel - array[i];
        }

        return trapwater;

    }

    public static int maxArea(int height[]) {
        int n = height.length;

        int left = 0;
        int right = n - 1;

        int max = Integer.MIN_VALUE;

        while (left < right) {
            int w = right - left;
            int bh = Math.min(height[left], height[right]);
            int c = w * bh;

            max = Math.max(max, c);

            if (height[left] < height[right]) {
                left++;

            } else if (height[right] < height[left]) {
                right--;
            } else {
                left++;
                right++;
            }

        }
        return max;
    }

    public static boolean checkvowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public static String reverseStringvowels(String s) {

        char ch[] = s.toLowerCase().toCharArray();
        int start = 0;
        int end = ch.length - 1;

        StringBuilder sb = new StringBuilder();

        while (start < end) {
            if (!checkvowel(ch[start])) {
                start++;

            }
            if (!checkvowel(ch[end])) {
                end--;

            }

            if (checkvowel(ch[start]) && checkvowel(ch[end])) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }

        }

        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }

        return sb.toString();

    }

    public static String reverseStringFromI(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i' || s.charAt(i) == 'I') {
                sb.reverse();
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }

    public static String reversewithk(String s, int k) {

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i += k * 2) {
            int start = i;
            int end = Math.min(ch.length - 1, i + k - 1);

            while (start < end) {

                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;

                start++;
                end--;
            }

        }
        String sn = new String(ch);
        return sn;

    }

    public static int[] moveZeros(int nums[]) {

        int n = nums.length;

        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;

            }
        }

        return nums;
    }

    public static int[] opreations(int nums[]) {
        int n = nums.length;

        int k = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            
        }

        for(int i=0;i<n;i++){
            if (nums[i] != 0) {

                nums[k] = nums[i];
                k++;

            }
        }

        while (k < n) {
            nums[k] = 0;
            k++;
        }

        return nums;
    }



    public static String removeStar(String s){

        StringBuilder sb= new StringBuilder("");

        char ch[]= s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]!='*'){
                sb.append(ch[i]);
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        

        return sb.toString();
   



    }


    public static boolean backspaceString(String s,String t){
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();

        char c1[]= s.toCharArray();
        char c2[]=t.toCharArray();

        for(int i=0;i<c1.length;i++){
            if(c1[i]=='#'){
                if(s1.length()>0){
                    s1.deleteCharAt(s1.length()-1);
                }
            }else{
                s1.append(c1[i]);
            }
        }

        for(int i=0;i<c2.length;i++){
            if(c2[i]=='#'){
                if(s2.length()>0){
                    s2.deleteCharAt(s2.length()-1);
                }
            }else{
                s2.append(c2[i]);
            }
        }
        System.err.println(s1);
                System.err.println(s2);


        return s1.toString().equals(s2.toString());
    }




    public static int baseBallScore(String []operations){
        int n=operations.length;
        int scores[]=new int[1];

        for(int i=0;i<n;i++){
            if(operations[i]=="C"){
                scores=Arrays.copyOfRange(scores, 0, scores.length-1);

            }else if(operations[i]=="D"){
                int lastScore=scores[scores.length-1];
                scores=Arrays.copyOf(scores, scores.length+1);
                scores[scores.length-1]=lastScore*2;
            }else if(operations[i]=="+"){
                int lastScore=scores[scores.length-1];
                int lastSecondScore=scores[scores.length-2];
                scores=Arrays.copyOf(scores,scores.length+1);
                scores[scores.length-1]=lastScore+lastSecondScore;
            }else{
                scores=Arrays.copyOf(scores, scores.length+1);
                scores[scores.length-1]=Integer.valueOf(operations[i]);
            }
        }


        int sum=0;

        for(int i=0;i<scores.length;i++){
            sum+=scores[i];
        }

        return sum;

    }

    public static void main(String[] args) {

        String []operations={"5","2","C","D","+"};

        System.out.println(baseBallScore(operations));

   

        

    }

}