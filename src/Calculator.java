import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Add First Number : ");
        int a = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Add Sign : ");
        String b = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Add Second Number : ");
        int c = scanner2.nextInt();

        if (b.equals("+")) {
            System.out.println("Answer = " + (a + c));
        } else if (b.equals("-")) {
            System.out.println("Answer = " + (a - c));
        } else if (b.equals("/")) {
            System.out.println("Answer = " + (a / c));
        }else if (b.equals("*")) {
            System.out.println("Answer = " + (a * c));
        }
    }
}
