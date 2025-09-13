import java.util.Scanner;  

public class App {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        int a; 
        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçap girin: ");
        r = inp.nextInt();  

        System.out.print("Merkez açı ölçüsünü girin: ");
        a = inp.nextInt();  

        double alan = (pi * (r * r) * a) / 360;
        System.out.print("Dairenizin alanı: " + alan);
        
    }
}