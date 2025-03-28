import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibonacci(n));
        scn.close();
    }
    public static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}