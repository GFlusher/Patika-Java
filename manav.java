import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float armut=2.14f, elma=3.67f, domat=1.11f, muz=0.95f, patli=5.00f;
        
        System.out.println("Armut Kaç Kilo ? :"); 
        int armutk = sc.nextInt();
        
        System.out.println("Elma Kaç Kilo ? :"); 
        int elmak = sc.nextInt();
        
        System.out.println("Domates Kaç Kilo ? :"); 
        int domatk = sc.nextInt();
        
        System.out.println("Muz Kaç Kilo ? :"); 
        int muzk = sc.nextInt();
        
        System.out.println("Patlıcan Kaç Kilo ? :"); 
        int patlik = sc.nextInt();
        
        float a = armut * armutk;
        float b = elma * elmak;
        float c = domat * domatk;
        float d = muz * muzk;
        float e = patli * patlik;
        float top = a+c+b+d+e;
        
        System.out.print("Toplam Tutar :"+ top + "TL");
        
    }
}