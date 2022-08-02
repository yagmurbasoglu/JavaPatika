import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adini giriniz : ");
        String userName;
        userName = input.nextLine();

        System.out.print("Sifrenizi giriniz : ");
        String password;
        password = input.nextLine();

        if (userName.equals("kullanici") && password.equals("1234")){
            System.out.print("Giris Basarili! ");
        } else if (password != "1234" ){
            System.out.print("Yanlis sifre.\n Sifreyi Sifirlamak Ister misiniz ? = ");

        }
        String karar;
        String evet, hayir , yeniSifre;
        karar = input.nextLine();
        if ( karar.equals("hayir")) {
            System.out.print("Sifrenizi tekrar giriniz! ");
        } else if (karar.equals("evet")){
                System.out.print("Yeni sifrenizi giriniz! =  ");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals("1234")){
                    System.out.print("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else if (yeniSifre != ("1234")) {
                    System.out.print("Sifre Olusturuldu.");

                }
        }

    }}
