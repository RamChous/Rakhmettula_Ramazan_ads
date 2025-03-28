import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(a, n));
        scn.close();
    }
    public static int power(int a, int n) {
        if (n == 1)
            return a;
        return power(a, n - 1) * a;
    }
}