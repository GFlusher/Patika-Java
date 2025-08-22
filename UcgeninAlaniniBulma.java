import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci kenar:");
        int bk =input.nextInt();
        System.out.print("İkinci kenar:");
        int ik =input.nextInt();
        System.out.print("Üçüncü kenar:");
        int uk =input.nextInt();
        int u = (bk+ik+uk)/2;
        double alan = Math.sqrt(u*(u-bk)*(u-ik)*(u-uk));
        System.out.println("Üçgeninizin alanı: "+ alan);
    }
}