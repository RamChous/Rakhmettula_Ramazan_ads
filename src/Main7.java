import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
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
}