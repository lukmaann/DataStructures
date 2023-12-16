package Strings.Quetions;
import java.util.*;

public class vowelsCount {


    public static int countVowels(String str){

        int count =0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;

            }



        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the string: ");

        String str=sc.nextLine();
        System.out.println(countVowels(str));



        
    }
    
}
