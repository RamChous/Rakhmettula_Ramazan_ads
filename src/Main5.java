import java.util.Scanner;

public class Main5 {
    public Main5() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(problem5(n));
        scn.close();
    }

    public static int problem5(int n) {
        return n != 1 && n != 2 ? problem5(n - 1) + problem5(n - 2) : 1;
    }
}