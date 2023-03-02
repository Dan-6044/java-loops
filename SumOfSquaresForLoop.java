class SumOfSquaresForLoop
{
   public static void main(String args[])
   {
      
      int sum = 0;

     for (int i = 1; i <=15; i++){
           sum += i * i;
      }
     System.out.println("\nThe sum of the squares of te first 15 positive integers is:" + sum);

     
   }
}