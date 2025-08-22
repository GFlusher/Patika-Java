import java.util.Scanner;
public class main {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Birinci kenar:");
       int bk =input.nextInt();
        System.out.print("İkinci kenar:");
        int ik =input.nextInt();
        double hp= Math.sqrt(bk*bk + ik*ik);
        System.out.println("Hipotenüs: "+hp);

    }
}
