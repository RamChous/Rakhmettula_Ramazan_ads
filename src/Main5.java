import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(problem5(n));
        scn.close();
    }
    public static int problem5(int n) {
        if (n == 1 || n == 2)
            return 1;
        return problem5(n - 1) + problem5(n - 2);
    }
}