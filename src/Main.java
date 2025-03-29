import java.util.Scanner;

public class Main {
    // Complexity: linear - O(N)
    public static void problem1() {
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

    // Complexity: linear - O(N)
    public static void problem2() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; ++i) {
            nums[i] = scn.nextInt();
        }
        System.out.println((double)sum(n, nums) / n);
        scn.close();
    }
    public static int sum(int n, int[] nums) {
        if (n == 1)
            return nums[0];
        return nums[n - 1] + sum(n - 1, nums);
    }

    // Complexity: linear - O(N)
    public static void problem3() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (PrimeOrComp(n, n / 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        scn.close();
    }
    public static boolean PrimeOrComp(int n, int d) {
        if (n <= 1)
            return false;
        if (d == 1)
            return true;
        if (n % d == 0)
            return false;
        return PrimeOrComp(n, d - 1);
    }

    // Complexity: linear - O(N)
    public static void problem4() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
        scn.close();
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return factorial(n - 1) * n;
    }

    // Complexity: exponential - O(2^N)
    public static void problem5() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibonacci(n));
        scn.close();
    }
    public static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Complexity: linear - O(N)
    public static void problem6() {
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

    // Complexity: factorial - O(N!)
    public static void problem7() {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        permutations(str, "");
        scn.close();
    }
    public static void permutations(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
        }
        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            String remain = str.substring(0, i) + str.substring(i + 1);
            permutations(remain, result + ch);
        }
    }

    // Complexity: linear - O(N)
    public static void problem8() {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        if (AllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scn.close();
    }
    public static boolean AllDigits(String s, int i) {
        if (s.isEmpty())
            return false;
        if (s.length() == i)
            return true;
        if (!Character.isDigit(s.charAt(i)))
            return false;
        return AllDigits(s, i + 1);
    }

    // Complexity: exponential - O(2^N)
    public static void problem9() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(BinomialCoeff(n, k));
        scn.close();
    }
    public static int BinomialCoeff(int n, int k) {
        if (k == 0 && k == n)
            return 1;
        return BinomialCoeff(n - 1, k - 1) + BinomialCoeff(n - 1, k);
    }

    // Complexity: logarithmic - O(log min(a, b))
    public static void problem10() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(gcd(a, b));
        scn.close();
    }
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    public static void main(String[] args) {

    }
}