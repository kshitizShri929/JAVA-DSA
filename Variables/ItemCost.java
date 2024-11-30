import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter price of Items:");
        
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        int $=24;
        
        float total = (pen + pencil + eraser);
        float gst = (total * 0.18f);
        float bill=total+gst;
        
        
        System.out.println("Total bill for purchased items: " + bill);
    }
}
