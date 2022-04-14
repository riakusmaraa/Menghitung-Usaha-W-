import java.util.Scanner;

public class usaha {
    public static void main(String[] args) {
        double m, F, s, a, W;
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan massa benda (m): ");
        m = input.nextDouble();
        
        System.out.print("Masukkan gaya benda (F): ");
        F = input.nextDouble();
        
        System.out.print("Masukkan perpindahan benda (s): ");
        s = input.nextDouble();
        
        System.out.print("Masukkan sudut antar perpindahan dan gaya (a): ");
        a = input.nextDouble();
        
        //proses
        double radian = Math.toRadians(a);
        W = F * Math.cos(radian) * s;
                
        //output
        System.out.println("Nilai usaha (W) adalah " + String.format("%.1f", W) + " Joule");
    }
    
}