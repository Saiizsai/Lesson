import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add Your Radius : ");
        int i = scanner.nextInt();
        System.out.println("Area Of Circle Value = " + convertToAoC(i));

    }
    public static double convertToAoC (int radius) {
        double result = (radius * radius) * 3.14 ;
        return result;
    }
}
