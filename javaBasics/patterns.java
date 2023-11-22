package javaBasics;

import java.util.*;

public class patterns {
    public static void main(String args[]) {
        // Scanner sc= new Scanner(System.in);

        // System.out.print("ENter the size=");
        // int last=sc.nextInt();
        // for (int i=1;i<=last;i++){
        // for (int j=1;j<=last;j++){
        // if(i==1||j==1||i==last||j==last){
        // System.out.print("* ");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n=4;
        // for (int i=1;i<=n;i++){
        // for (int j=1;j<=n-i;j++){
        // System.out.print(" ");
        // }
        // for (int k=1;k<=i;k++){
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // int n=5;
        // for (int i=n;i>0;i--){
        // for (int j=1;j<=i;j++){
        // System.out.print(j);

        // }
        // System.out.println();
        // }

        // int n=1;
        // for (int i=1;i<=5;i++){
        // for (int j=1;j<=i;j++){
        // System.out.print(n);
        // n++;
        // }
        // System.out.println();
        // }

        // boolean x = true;

        // for (int line = 1; line <= 5; line++) {
        // for (int j = 1; j <= line; j++) {

        // if (x) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }

        // x = !x;

        // }
        // System.out.println();
        // }

        // int n = 4;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*  ");
        //     }
        //     for (int k = 1; k <= (n - i) * 2; k++) {
        //         System.out.print("   ");
        //     }
        //     for (int l = 1; l <= i; l++) {
        //         System.out.print("*  ");
        //     }

        //     System.out.println();
        // }

        // for (int i=n;i>=0;i--){


        //     for(int j=1;j<=i;j++){
        //         System.out.print("*  ");
        //     }

        //     for (int k=1;k<=(n-i)*2;k++){
        //         System.out.print("   ");
        //     }

        //     for (int l=1;l<=i;l++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }


        // int n=4;
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=n-i;j++){
        //         System.out.print("   ");
        //     }

        //     for (int k=1;k<=n;k++){
        //         System.out.print("*  ");
        //     }

        //     System.out.println();
        // }


        // int n=4;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("   ");
        //     }

        //     for (int k=1;k<=n;k++){
        //         if(i==1||i==n||k==1||k==n){
        //             System.out.print("*  ");
        //         }else{
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n=4;
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=(n-i);j++){
        //         System.out.print("   ");
        //     }

        //     for( int k=1;k<=(i*2)-1;k++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }
        // for (int i=n-1;i>=1;i--){
        //     for (int j=1;j<=(n-i);j++){
        //         System.out.print("   ");
        //     }

        //     for( int k=1;k<=(i*2)-1;k++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }


        int n=5;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print("   ");
            }
            for (int k=i;k>=1;k--){
                System.out.print(k +"  ");
            }
            for (int k=2;k<=i;k++){
                System.out.print(k+"  ");
            }
            System.out.println();
        }
        
    }
}