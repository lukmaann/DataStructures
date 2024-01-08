
public class countDigit {

    public static int count(int n) {
        int c = 0;

        while (n > 0) {
            c++;
            n = n / 10;

        }
        return c;
    }

    public static void main(String[] args) {

        System.out.println(count(12345));

    }

}
