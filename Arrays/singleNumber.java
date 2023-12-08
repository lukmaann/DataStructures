package Arrays;

import java.util.Arrays;

public class singleNumber {

    public static int checkSingleNumber(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j =0; j < array.length; j++) {
                if (i!=j&&array[i] == array[j]) {
                    count++;
                }

            }
            if (count == 0) {
                return array[i];
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 1, 2, 3 };

        System.out.println(checkSingleNumber(array));
        ;
    }

}
