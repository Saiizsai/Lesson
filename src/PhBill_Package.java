import java.util.Scanner;

public class PhBill_Package {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Call *979# To Buy Package : ");
        String a = scanner.nextLine();

        if (a.equals("*979#")) {
            System.out.println("1. Voice Package \n2. Data Package \n3. SMS Package \n4. Facebook Package ");
            int i = scanner.nextInt();

            if (i == 1) {

                System.out.println("1. 10Minutes - 99Ks \n2. 50Minutes - 400Ks");
                Scanner scanner1 = new Scanner(System.in);
                int b = scanner1.nextInt();
                if (b == 1) {
                    System.out.println("Successfully Purchased 10Minutes - 99Ks");
                } else if (b == 2) {
                    System.out.println("Successfully Purchased 50Minutes - 400Ks");
                }

            } else if (i == 2) {
                System.out.println("1. 350Mb - 799Ks \n2. 480Mb - 999Ks \n3. 770Mb - 1599Ks");
                Scanner scanner2 = new Scanner(System.in);
                int c = scanner2.nextInt();
                if (c == 1) {
                    System.out.println("Successfully Purchased 350Mb - 799Mb");
                } else if (c == 2) {
                    System.out.println("Successfully Purchased 480Mb - 999Ks");
                } else if (c == 3) {
                    System.out.println("Successfully Purchased 770Mb - 1599Ks");
                }

            } else if (i == 3) {
                System.out.println("1. 7Days - 499Ks \n2. 12Hours - 69Ks");
                Scanner scanner3 = new Scanner(System.in);
                int e = scanner3.nextInt();
                if (e == 1) {
                    System.out.println("Successfully Purchased 7Days - 499Ks");
                } else if (e == 2) {
                    System.out.println("Successfully Purchased 12Hours - 69Ks");
                }

            } else if (i == 4) {
                System.out.println("1. 1Days - 499Ks \n2. 3Days - 999Ks");
                Scanner scanner4 = new Scanner(System.in);
                int f = scanner4.nextInt();
                if (f == 1) {
                    System.out.println("Successfully Purchased 1Days - 499Ks");
                } else if (f == 2) {
                    System.out.println("Successfully Purchased 3Days - 999Ks");
                }
            }
            System.out.println("Thanks You So Much!");

        } else {
            System.out.println("Wrong Number, Try Again!!!");
        }
    }
}

