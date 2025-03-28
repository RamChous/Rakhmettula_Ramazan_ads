import java.util.Scanner;

public class Main1 {
    public Main1() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; ++i) {
            nums[i] = scn.nextInt();
        }

        System.out.println(problem1(n, nums));
        scn.close();
    }

    public static int problem1(int n, int[] nums) {
        if (n == 1) {
            return nums[0];
        } else {
            int min = problem1(n - 1, nums);
            return nums[n - 1] < min ? nums[n - 1] : min;
        }
    }
}