import java.util.Scanner;
public class main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("KDV'siz tutarı girin: ");
        double tutar = input.nextDouble();
        double kdv = (tutar * 118.0)/100.0;
        double frk = (kdv - tutar);
        System.out.println("KDV'li tutar: "+ kdv+"TL");
        System.out.println("KDV farkı: "+ frk +"TL");
    }
}
