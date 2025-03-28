import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
        scn.close();
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return factorial(n - 1) * n;
    }
}