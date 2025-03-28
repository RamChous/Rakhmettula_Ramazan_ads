import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (PrimeOrComp(n, n / 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        scn.close();
    }
    public static boolean PrimeOrComp(int n, int d) {
        if (n <= 1)
            return false;
        if (d == 1)
            return true;
        if (n % d == 0)
            return false;
        return PrimeOrComp(n, d - 1);
    }
}