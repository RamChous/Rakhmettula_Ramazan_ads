import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; ++i)
            nums[i] = scn.nextInt();
        System.out.println(minimum(n, nums));
        scn.close();
    }
    public static int minimum(int n, int[] nums) {
        if (n == 1)
            return nums[0];
        int min = minimum(n - 1, nums);
        if (nums[n - 1] < min) {
            return nums[n - 1];
        } else {
            return min;
        }
    }
}