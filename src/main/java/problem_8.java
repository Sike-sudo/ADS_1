import java.util.Scanner;
public class problem_8 {
    public static boolean isAllDigits(String s) {
        return s.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.next();
        System.out.println(s + " contains only digits? " + isAllDigits(s));
    }
}
