package Strings.Quetions;
import java.util.Arrays;

public class anagram {


    public static void checkAnagram(String str1,String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){

            char str1Array[]=str1.toCharArray();
            char str2Array[]=str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            if(Arrays.equals(str1Array, str2Array)){
                System.out.println("strings are ananagrams");
            }else{

                System.out.println("Strings are not anagrams");
            }



        }else{
            System.out.println(" string are not ananagrams");
        }
    }


    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";

        checkAnagram(str1, str2);
    }
    
}
