 class MultiplicationTable
 {
    public static void main(String[] args) 
      {
        int n = 6; 
        
        System.out.print("* ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
