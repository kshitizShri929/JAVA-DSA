import java.util.Scanner;

class Average {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter 3 numbers");
      
      
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      
      
      int sum = A + B + C;
      double average = sum / 3.0;  
      
    
      System.out.println("Avg of numbers: " + average);
   }
}

