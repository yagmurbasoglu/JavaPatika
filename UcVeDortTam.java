import java.util.Scanner;

public class UcVeDortTam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Bir Sayi Giriniz :");
        int sayi;
        sayi = input.nextInt();

        int toplam= 0, donguSayisi = 0;
        double ort;

        for (int i=0 ; i<=sayi; i++ ){
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                donguSayisi++;
            }
        }
        ort = toplam / (donguSayisi - 1);
        System.out.print("Ortalama "+ort);

    }
}
