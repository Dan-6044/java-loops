import java.util.Scanner;

class Reciprocal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice = 'c';

        while (choice == 'c') {
            System.out.print("Enter a non-zero number: ");
            int num = input.nextInt();

            while (num == 0) {
                System.out.println("Zero is not allowed. Please try again.");
                num = input.nextInt();
            }

            double reciprocal = 1.0 / num;
            System.out.println("The reciprocal of " + num + " is " + reciprocal);

            System.out.print("Do you want to continue? (c/x) ");
            choice = input.next().charAt(0);
        }
    }
}
