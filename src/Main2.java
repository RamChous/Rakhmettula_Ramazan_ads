import java.util.Scanner;

public class Main2 {
    public Main2() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; ++i) {
            nums[i] = scn.nextInt();
        }

        System.out.println((double)sum(n, nums) / (double)n);
        scn.close();
    }

    public static int sum(int n, int[] nums) {
        return n == 1 ? nums[0] : nums[n - 1] + sum(n - 1, nums);
    }
}