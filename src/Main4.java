import java.util.Scanner;

public class Main4 {
    public Main4() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(problem4(n));
        scn.close();
    }

    public static int problem4(int n) {
        return n != 0 && n != 1 ? problem4(n - 1) * n : 1;
    }
}