import java.util.Scanner;

public class Main10 {
    public Main10() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(problem10(a, b));
        scn.close();
    }

    public static int problem10(int a, int b) {
        return b == 0 ? a : problem10(b, a % b);
    }
}