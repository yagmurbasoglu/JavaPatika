import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gideceginiz mesafeyi km olarak giriniz : ");
        double km;
        km = input.nextDouble();
        System.out.print("Yasinizi giriniz : ");
        double age;
        age = input.nextDouble();
        System.out.print("Yolculuk tipini giriniz (1-Tek Yon , 2-Gidis-Donus)  : ");
        double type;
        type = input.nextDouble();
        if (km < 0 || age < 0 || type != 1 && type != 2) {
            System.out.println("Hatalı veri girdiniz !");
        }

        double price ;
        price = (km * 0.10);

        if (age<12){
            /* Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.*/
            price = (price/2);
        } else if (age<24) {
            /*Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.*/
            price = price - (price*0.1);
        } else if (age>65) {
            /*Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.*/
            price = price - (price * 0.3);
        }  if (type == 2) {
            /*Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
            price = price - (price * 0.2);
            price = price*2;

        }
       System.out.print("Toplam Tutar : " + price );

    }
}
