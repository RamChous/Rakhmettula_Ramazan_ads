import java.util.Scanner;

public class Main8 {
    public Main8() {
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        if (problem8(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scn.close();
    }

    public static boolean problem8(String s, int i) {
        if (s.isEmpty()) {
            return false;
        } else if (s.length() == i) {
            return true;
        } else {
            return !Character.isDigit(s.charAt(i)) ? false : problem8(s, i + 1);
        }
    }
}