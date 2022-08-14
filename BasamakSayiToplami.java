import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        int sayi;
        sayi = input.nextInt();

        int kalan;
        int toplam = 0;

        while (sayi>0){
            kalan = (sayi%10);
            toplam += kalan;
            sayi = (sayi/10);
        }

        System.out.print("Toplam : "+toplam);
    }
}
