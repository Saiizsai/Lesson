import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print ("Add Celsius : ");
        int i = scanner.nextInt();
        System.out.println(convertToF(i) + " F");
    }

    public static double convertToF (int celsius) {
        double result = celsius * 33.8;
        return result;
    }
}
