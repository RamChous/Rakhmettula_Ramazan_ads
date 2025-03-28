import java.util.Scanner;

public class Main7 {
    public Main7() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        problem7(str, "");
        scn.close();
    }

    public static void problem7(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
        }

        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            String var10000 = str.substring(0, i);
            String remain = var10000 + str.substring(i + 1);
            problem7(remain, result + ch);
        }

    }
}