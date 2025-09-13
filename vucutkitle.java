
import java.util.Scanner;
public class vucutkitle {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = inp.nextDouble();
        
        System.out.print("Lütfen kilonuzu giriniz :");
        int kilo = inp.nextInt();
        
        double vke= kilo/(boy*boy);
        
        System.out.println("Vücut Kitle İndeksiniz :" + vke);
    }
}
