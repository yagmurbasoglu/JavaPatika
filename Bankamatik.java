import java.util.Scanner;

public class Bankamatik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right=3;
        int select;
        double balance=1500;
        while (right > 0) {
            System.out.print("Kullanici Adi : ");
            String userName = input.nextLine();
            System.out.print("Sifre : ");
            String password = input.nextLine();
            if (userName.equals("odev") && password.equals("1234")) {
                System.out.println("Merhaba!Bankamiza Hosgeldiniz!");
            do {
                System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz:");
                System.out.println("1)Para Yatirma\n2)Para Cekme\n3)Bakiye Sorgula\n4)Cikis");
                System.out.print("Secim : ");
                select = input.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Yatirmak Istediginiz Tutar : ");
                        double yatirma = input.nextDouble();
                        System.out.println("Hesabiniza" + yatirma + "TL yatirilmistir.");
                        balance += yatirma;
                        System.out.println("Hesabinizdaki Toplam Tutar : "+balance);
                    break;
                    case 2:
                        System.out.print("Cekmek Istediginiz Tutar : ");
                        double cekme = input.nextDouble();
                        while (balance < cekme){
                            System.out.println("Hesabinizda Yeterli Miktarda Para Bulunmamaktadir.\n"
                                    + "Hesabinizda " + balance + " TL Bulunmaktadir. \n Lutfen Cekmek Istediginiz Tutari Tekrar Giriniz: ");
                            System.out.print("Cekmek Istediginiz Tutar : ");
                            cekme = input.nextDouble();
                        }
                        System.out.println("Hesabinizdan" +cekme+ "TL cekilmistir.");
                        balance -= cekme;
                        System.out.print("Hesabinizdaki Toplam Tutar : " + balance);
                    break;
                    case 3:
                        System.out.println("Hesabinizdaki Toplam Bakiye : "+balance);
                    break;
                    case 4:
                        System.out.print("Cikis Yaptiniz. Iyi Gunler Dileriz.");
                        break;
                }
            }while(select != 4);
                break;
            }else{
                System.out.println("Hatali Giris Yaptiniz. Tekrar Deneyiniz.");
                System.out.println("Kalan hakkiniz : "+ --right);
                if (right==0){
                    System.out.println("Hesabiniz Bloke OLmustur. ");

                }
            }

        }


    }
}
