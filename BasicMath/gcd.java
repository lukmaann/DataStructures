public class gcd {

    public static int gcd(int n1, int n2) {

        int max = Integer.MIN_VALUE;

        int largestNumber = Math.min(n1, n2);

        for (int i = 1; i <= largestNumber; i++) {

            if (n1 % i == 0 && n2 % i == 0) {
                max=i;
            }

        }

        return max;

    }

    public static void main(String[] args) {

        System.out.println(gcd(20, 40));

    }
}
