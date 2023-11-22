package javaBasics;

import java.util.*;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class javaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("enter x=");
        // int x=sc.nextInt();
        // System.out.print("enter y= ");
        // int y=sc.nextInt();

        // if(x>y){
        // System.out.println("x is greator");
        // }else{
        // System.out.println("Y is greator");
        // }

        // -----------------------------Income tax--------------------

        // System.out.print("Enter your income=");
        // int income=sc.nextInt();
        // float tax;

        // if(income<=500000){
        // tax=(0f/100)*100;

        // }else if(income>500000 && income<=1000000){
        // tax=(10f/100)*100;
        // }else{
        // tax=(20f/100)*100;
        // }

        // System.out.println("Your income is= "+income);
        // System.out.println("Your tax will be= "+tax);
        // System.out.println("You have to pay "+(income*tax)/100+" as tax");

        // ------------------------------------largest of 3------------------------

        // System.out.print("enter A= ");
        // int a =sc.nextInt();
        // System.out.print("Enter b= ");
        // int b=sc.nextInt();
        // System.out.print("Enter c= ");
        // int c=sc.nextInt();

        // if(a>b && a>c){
        // System.out.print("a is"+a+ "greator");
        // }else if(b>a && b>c){
        // System.out.print("b is "+b+" greator");
        // }else{
        // System.out.print("c is "+ c+ "greator");
        // }

        // -------------------------------student will pass or fail--------------------

        // System.out.println("******************Enter the marks*************");

        // System.out.print("Enter marks for Maths = ");
        // int maths=sc.nextInt();

        // System.out.print("Enter marks for kannad = ");
        // int kannad=sc.nextInt();

        // System.out.print("Enter marks for english = ");
        // int english=sc.nextInt();

        // System.out.print("Enter marks for science = ");
        // int science= sc.nextInt();

        // System.out.print("Enter marks for social science = ");
        // int socialScience=sc.nextInt();

        // int total=maths+science+socialScience+kannad+english;

        // System.out.println("Your total is "+total);

        // float percentage=(float)((total/500f)*100f);

        // if(percentage>=85){
        // System.out.println("You have secured a distinction");
        // }else if(percentage>=70 && percentage<85){
        // System.out.println("You have secured First class");
        // }else if(percentage>=40 && percentage<75){
        // System.out.println("You have secured second class");
        // }else{
        // System.out.println("You have failed");
        // }
        // System.out.println("Your percentage is: "+percentage);

        // ------------------------positive or negative----------------------------

        // System.out.print("Enter the number=");

        // int n=sc.nextInt();

        // if(n>0){
        // System.out.println("the number is positive");
        // }else{
        // System.out.println("the number is negative");
        // }

        // ------------------------------you have fever or not
        // ---------------------------

        // double temp=103.4;
        // if(temp>100){
        // System.out.println("you have fever");

        // }else{
        // System.out.println("you dont have fever");
        // }

        // -----------------------------------day of week -----------------------
        // System.out.print("Enter the day number= ");
        // int day=sc.nextInt();

        // switch(day){
        // case 1:System.out.print("monday");
        // break;
        // case 2:System.out.println("tuesday");
        // break;
        // case 3:System.out.println("wednesday");
        // break;
        // case 4:System.out.println("thursday");
        // break;
        // case 5 :System.out.println("friday");
        // break;
        // case 6:System.out.println("saturday");
        // break;
        // case 7:System.out.println("sunday");
        // break;
        // default:System.out.print("not a valid day number");
        // }

        // ----------------------------------leap year--------------------------

//         boolean go = true;

//         while (go) {
            // System.out.print(" Enter the year=");
            // int year = sc.nextInt();

            // if(year%4==0 && (year%100!=0 || year%400==0)){
            //     System.out.println("leap");
            // }
            // else{
            //     System.out.print("not a leap");

        //     }

            

        // }

    // }

    // -----------------------------------for loop---------------------------
    

//     System.out.println("Enter the number of time you want to reapeat := ");
//     int num=sc.nextInt();

//     for(int i=0;i<=num;i++){
//         System.out.println(i);
//     }
    

// // --------------------------------sum of n natural numbers-------------------

// System.out.println("Enter the n number you want sum of := ");
// int n =sc.nextInt();
// int sum=0;

// for(int i=0;i<=n;i++){
//     sum+=i;
// }

// System.out.print("sum="+sum);


// -------------------------------------sum of natural numbers using while loop-----------

// System.out.print("ENter the n number = ");
// int n=sc.nextInt();
// int i=0;
// int sum=0;

// while (i<=n) {

//     sum+=i;
//     i++;

    
// }

// System.out.println("sum="+sum);

// ------------------------------------------print square pattern--------------------

// for(int i=1;i<=4;i++){
//     System.out.println("* * * *");
// }


// ------------------------------------------ print reverse of a number------------------------


// System.out.println("Enter the number =");
// int num=sc.nextInt();

// while(num>0){
//     System.out.print(num%10);
//     num/=10;
// }


// ----------------------------------------reverse a number---------------------


// System.out.print("enter the number= ");
// int n=sc.nextInt();
// int rev=0;

// while(n>0){
//     int ld=n%10;
//     rev=(rev * 10)+ld;
//     n/=10;
// }


// System.out.println("revered number is ="+rev);

// -----------------------------------break--------------------------------

// int num=0;
// while(true){
//     System.out.print("Enter the number to add=");
//     int n=sc.nextInt();
//     num+=n;
//     System.out.println("now the sum is="+num);

//     if(num>=1000){
//         break;
//     }
    
// }



// ---------------------------------print untill user enters multiple of 10------

// while(true){
//     System.out.print("enter the number=");
//     int n=sc.nextInt();
//     if(n%10==0){
//         break;
//     }
//     System.out.println(n);
// }
    
// ----------------------------------prime or not -------------------

// while (true) {
//     System.out.print("Enter the number =");

//     int n=sc.nextInt();
//     if(n==10101){
//         break;
//     }

//    boolean isPrime=true;

//     for(int i=2;i<=Math.sqrt(n);i++){

//         if(n%i==0){
//             isPrime=false;

//         }
    

//     }
//     System.out.println(isPrime);
    
// } 


// --------------------------sum of odd and even------------------

// System.out.println("******even odd sum***********");

// boolean choice=true;
// int evensum=0;
// int oddsum=0;

// do{
//     System.out.print("Enter the number=");
//     int number=sc.nextInt();
//     if(number%2==0){
//         evensum+=number;

//     }else{
//         oddsum+=number;
//     }

//     System.out.println("Enter your choice do you wannt to continue y or n");
//     char ch=sc.next().charAt(0);

//     // System.out.println(ch);

//     if(ch!='y'){
//         choice=false;
//     }

// }while(choice);


// System.out.println("Even number sum="+evensum);
// System.out.println("odd number sum="+oddsum);


// --------------------------------factorial---------------------------

// System.out.println("********Factoral of numbers*******");
// System.out.print("Enter the number : ");

// int fact=1;

// int n=sc.nextInt();

// for (int i=n;i>0;i--){
//     fact*=i;

// }

// System.out.println("factorail is "+fact);


// ---------------------------------multiplecation table------------------------
// System.out.println("******Multiplocation Table******");
// System.out.print("enter your number : ");

// int n=sc.nextInt();
// for (int i=1;i<=10;i++){
//     System.out.println(n +"x"+i+"="+(n*i));
// }



// Write a program to calculate the sum of all even numbers between 1 and 50 using a while loop.


// int i=0;
// int sum=0;
// while(i<=50){
//     if(i%2==0){
//         sum+=i;
//     }
//     i++;

// }


// System.out.println(sum);



// Write a program to print the Fibonacci series up to a given number using a while loop.

System.out.print("Enter the number: ");
int n =sc.nextInt();
int i=0;
int j=1;
int k=0;
while(i<=n){

 
    System.out.print(i+",");
       k=i+j;
    i=j;
    j=k;

    
}


























}
}