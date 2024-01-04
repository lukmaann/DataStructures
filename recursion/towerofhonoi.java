package recursion;

public class towerofhonoi {

    public static void solution(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfering " + n + " from " + src + " to " + dest);
            return;
        }

        solution(n - 1, src, dest, helper);
        System.out.println("Transfering " + n + " from " + src + " to " + dest);
        solution(n-1, helper, src, dest);

    }

    public static void main(String args[]) {
        solution(2,"src", "helper", "dest");

    }
}