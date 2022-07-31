import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz : ");
        int n1;
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        int n2;
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme ");
        System.out.print("Yapilacak Islemi Seciniz : " );
        int secim;
        secim = input.nextInt();

        switch (secim){
            case 1 :
                System.out.print("Toplam :"+ (n1 + n2));
            break;
            case 2 :
                System.out.print("Cikarma : "+ (n1 - n2));
            break;
            case 3 :
                System.out.print("Carpma : "+ (n1 * n2));
            break;
            case 4 :
                if (n1 == 0){
                    System.out.print("Sonuc 0");
                } else if (n2 == 0) {
                    System.out.print("Sifira bolunemez");

                } else{
                    System.out.print("Sonuc : "+ (n1/n2));

        }   break;
            default:
                System.out.print("Sonuc : Lutfen yukaridaki gecerli islemlerden birini seciniz.");

    }
}}
