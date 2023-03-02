class DoWhile
{
   public static void main(String args[])
   {
      System.out.println("Number\tSquare\tCube");

      int num = 2;


      do
      {
        int square = num * num;
        int cube = num * num * num;
        System.out.println(num + "\t" + square + "\t" + cube);
          num++;
      }while(num <= 10);
   }
}