package Strings.ArrayOfStrings;

import java.util.*;

public class Strings {

    public static boolean palindrome(String str) {
        int start = 0;
        int end = str.length()-1;

        while (start<=end) {
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }

        return true;

        

        
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the your name:");
        // String name = sc.nextLine();
        // System.out.println(Character.isLetterOrDigit(name.charAt(0)));
        // // System.out.println(palindrome(name));


        String strings[]={"apple","applq","a"};
        String largest=strings[0];
        for(int i=0;i<strings.length;i++){
            if(largest.compareTo(strings[i])<0){
                largest=strings[i];
            }
        }

        System.out.print(largest);
    }

}
