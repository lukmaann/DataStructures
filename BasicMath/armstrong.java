public class armstrong {

    public static boolean check(int x) {
        int num = x;
        int digit = 0;

        int orgnum = x;
        int sum = 0;

        while (x > 0) {
            digit++;
            x /= 10;

        }

        while (orgnum > 0) {
            int ld = orgnum % 10;
            sum += Math.pow(ld, digit);
            orgnum /= 10;

        }

        return sum == num;

    }

    public static void main(String[] args) {

        System.out.println(check(153));

    }

}
