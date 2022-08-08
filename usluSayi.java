import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabani giriniz (sayi>0) : ");
        int a;
        a = input.nextInt();
        System.out.print("Kuvveti giriniz (sayi>0): ");
        int b;
        b = input.nextInt();

        int total=1;
        for (int i=1 ; i<=b;i++){
            total *=a;
        }
        System.out.print("Sonuc: "+ total);
    }
}
