import java.util.Scanner;

class SumOfIntegers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter a list of integers. Enter 0 to terminate:");

        do {
            num = input.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("The sum is: " + (sum - num)); //subtract the last entered zero from the sum
    }
}





