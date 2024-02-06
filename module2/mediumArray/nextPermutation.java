
public class nextPermutation {

    public static void solution(int array[]) {

        int n = array.length;

        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (array[i] < array[i + 1]) {
                index = i;
                System.out.println(index);
                break;
            }
        }

        if (index == -1) {
            int s = 0;
            
            int e = n - 1;
            while (s < e) {
          
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;

                s++;
                e--;

            }

        }else{

        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > array[index]) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                break;
            }
        }

        int s = index + 1;
        int e = n - 1;

        while (s < e) {
            int temp = array[s];
            array[s] = array[e];
            array[e] = temp;
            s++;
            e--;

        }
    }

    }


    
    
 

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 3,2,1};
        printArray(array);
        solution(array);
        printArray(array);

      


    }

}
