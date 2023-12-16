package Strings.Quetions;

public class convertFirstLetterToUpperCase {

    public static String toUpperCase(String str){

        StringBuilder sb= new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                char c=Character.toUpperCase(str.charAt(i));
                sb.append(c);
            }else{
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();


    
    }

   

    public static void main(String[] args) {

        String str = "i am lukmaan l";

        System.out.println(toUpperCase(str));

    }

}
