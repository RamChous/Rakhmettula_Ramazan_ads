import java.util.Scanner;

public class Main6 {
    public Main6() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(problem6(a, n));
        scn.close();
    }

    public static int problem6(int a, int n) {
        return n == 1 ? a : problem6(a, n - 1) * a;
    }
}