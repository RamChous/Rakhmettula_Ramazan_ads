import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
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
}