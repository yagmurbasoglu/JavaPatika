import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutKg =2.14,elmaKg = 3.67, domatesKg = 1.11,muzKg = 0.95,patlicanKg = 5.00;
    double armutMik , elmaMik,domatesMik,muzMik,patlicanMik;
    System.out.print("Armut Kac Kilo ? : ");
    armutMik = input.nextDouble();
    System.out.print("Elma Kac Kilo ? : ");
    elmaMik = input.nextDouble();
    System.out.print("Domates Kac Kilo ? : ");
    domatesMik = input.nextDouble();
    System.out.print("Muz Kac Kilo ? : ");
    muzMik = input.nextDouble();
    System.out.print("Patlican Kac Kilo ? : ");
    patlicanMik = input.nextDouble();

        double topTut = ((armutKg*armutMik)+(elmaMik*elmaKg)+(domatesMik*domatesKg)+(muzMik*muzKg)+(patlicanMik*patlicanKg));
       System.out.println("Toplam tutar : "+topTut);

    }
}
