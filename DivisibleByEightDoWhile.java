class DivisibleByEightDoWhile
{
   public static void main(String args[])
   {
     int num = 1;

     do {
           if (num % 8 == 0) {
      
     System.out.println(num);
       }
       num++;
     }while ( num <=200);
     
   }
}