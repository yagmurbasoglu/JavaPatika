import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Notlarinizi Giriniz : ");
        System.out.println("Matematik Notunu Girin : ");
double mat = input.nextDouble();
System.out.println("Fizik Notunuzu Girin : ");
double fizik = input.nextDouble();
System.out.println("Kimya Notunuzu Girin : ");
double kimya = input.nextDouble();
        System.out.println("Turkce Notunu Girin");
        double turkce = input.nextDouble();
        System.out.println("Tarih Notunu Girin");
        double tarih = input.nextDouble();
        System.out.println("Muzik Notunu Girin");
        double muzik = input.nextDouble();
        System.out.println("Not Ortalamaniz : ");
        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println(ortalama);
        String str = ortalama >= 60 ? "Gectiniz." : "Kaldınız.";
        System.out.println(str);

    }
}
