import java.util.Scanner;
public class problem_6 {
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int n = scanner.nextInt();
        System.out.println(a + "^" + n + " = " + power(a, n));
    }
}
