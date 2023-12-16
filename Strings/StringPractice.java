package Strings;

public class StringPractice {


    public static String subStrings(String str,int si,int ei){

        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }

        return substr;

    }

    public static void main(String[] args) {
        String s1="iamLukmaan";
        String s2=new String("iamLukmaan");

        System.out.println(s1.substring(5,7));
        
    }
    
}
