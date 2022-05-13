import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Add Your Year : ");
        int i = scanner.nextInt();

        if (i / 4 == 0) {
            System.out.println("It's A Leap Year");
        } else {
            System.out.println("It's Not A Leap Year");
        }
    }
}
