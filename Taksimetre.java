import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gittiğiniz yolu Kilometre cinsinden girin:");
        double yol = input.nextDouble();
        double ucret = (10.00+yol*2.20);
        if (ucret<20){
            ucret = 20;
        }
        System.out.println("Taksi tutarı: "+ ucret+"TL");

    }
}
