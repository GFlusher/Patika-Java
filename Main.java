
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, tur, tar, muz;
        System.out.println("Matematik Notunuzu Girin:");
        mat = input.nextInt();
        System.out.println("Fizik Notunuzu Girin:");
        fiz = input.nextInt();
        System.out.println("Kimya Notunuzu Girin:");
        kim = input.nextInt();
        System.out.println("Türkçe Notunuzu Girin:");
        tur = input.nextInt();
        System.out.println("Tarih Notunuzu Girin:");
        tar = input.nextInt();
        System.out.println("Müzik Notunuzu Girin:");
        muz = input.nextInt();
        int sonuc = (mat + fiz + kim + tur + tar + muz)/6 ;
        System.out.println("Not Ortalamanız:"+sonuc);
        if (sonuc < 60) {
            System.out.println("Kaldın!");
        }
        else if (sonuc >= 60) {
            System.out.println("Geçtin!");
        }
    }
}
