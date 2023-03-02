import java.util.Scanner;

 class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the deposit amount: ");
        double deposit = input.nextDouble();
        System.out.print("\nEnter the interest rate (as a percentage): ");
        double rate = input.nextDouble() / 100.0;
        System.out.print("\nEnter the number of years: ");
        int years = input.nextInt();

        
        double balance = deposit;
        System.out.println("Year\tInterest\tBalance");
        for (int i = 1; i <= years; i++) {
            double interest = balance * rate;
            balance += interest;
            System.out.printf("%d\t%.2f\t\t%.2f\n", i, interest, balance);
        }

        
        double compoundedInterest = balance - deposit;
        System.out.printf("\nThe compounded interest for %d years is Kshs. %.2f\n", years, compoundedInterest);
    }
}
