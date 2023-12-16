package Bitmanipulation;

public class practice {

    public static void checkEvenOrOdd(int n) {
        if ((n & 1) == 1) {
            System.out.println("odd");

        } else {
            System.out.println("even");
        }
    }

    public static int getIthBit(int n, int i) {

        int bitMask = 1 << i;

        int result = n & bitMask;

        if (result == 0) {
            return 0;

        } else {
            return 1;
        }

    }

    public static int setithBit(int n, int i) {
        int bitmask = 1 << i;

        return n | bitmask;

    }

    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1 << i);

        return n & bitmask;
    }

    public static int updatebit(int n, int i, int newbit) {
        if (newbit == 1) {
            return setithBit(n, i);
        } else if (newbit == 0) {
            return clearIthbit(n, i);
        } else {
            return -1;
        }
    }

    public static int clearibits(int n, int i) {

        int bitmask = ~0 << i;

        return n & bitmask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = ~0 << (j + 1);
        int b = (1 << i) - 1;

        System.out.println(a);

        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean checkNumberIs2power(int n) {
        return (n & (n - 1)) == 0;
    }

   public static int countSetBits(int n){
    int count=0;

    while (n>0) {
        count+=n&1;
        n>>=1;
        
    }



    return count;
   }

    public static void main(String[] args) {
        System.out.println(countSetBits(7));
    }

}
