import java.util.Scanncer;
public class Avarage{
    public static void main(String[] args){
        Scanncer sc=new Scanncer (System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int avg= (a+b+c)/3;
         System.out.print("Avarage of 3 number is", avg);

    }
}