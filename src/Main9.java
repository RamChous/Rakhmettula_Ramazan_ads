import java.util.Scanner;

public class Main9 {
    public Main9() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(problem9(n, k));
        scn.close();
    }

    public static int problem9(int n, int k) {
        return k != 0 && k != n ? problem9(n - 1, k - 1) + problem9(n - 1, k) : 1;
    }
}