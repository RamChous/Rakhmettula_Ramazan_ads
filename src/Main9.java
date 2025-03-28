import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(BinomialCoeff(n, k));
        scn.close();
    }
    public static int BinomialCoeff(int n, int k) {
        if (k == 0 && k == n)
            return 1;
        return BinomialCoeff(n - 1, k - 1) + BinomialCoeff(n - 1, k);
    }
}