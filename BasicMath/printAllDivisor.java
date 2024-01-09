public class printAllDivisor {

    public static void printDivisor(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                System.out.println(n / i);
            }
        }
    }

    public static int sumOfDivisor(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }

        }
        return sum;
    }

    public static int sumofAllDivisorsinRange(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += sumOfDivisor(i);
        }

        return total;
    }

    public static int sod(int n) {

        int total = 0;
        for (int nums = 1; nums <= n; nums++) {

            int sum = 0;

            for (int i = 1; i <= Math.sqrt(nums); i++) {
                if (nums % i == 0) {
                    sum += i;
                    if (i != (nums / i)) {
                        sum += nums / i;
                    }
                }

            }

            total += sum;

        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(sod(5));

    }

}
