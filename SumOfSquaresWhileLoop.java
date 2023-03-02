class SumOfSquaresWhileLoop
{
   public static void main(String args[])
   {
      
      int i = 1, sum = 0;

     while(i <= 15) {
        sum += i * i;
        i++;
      }
     System.out.println("\nThe sum of the squares of te first 15 positive integers is:" + sum);

     
   }
}