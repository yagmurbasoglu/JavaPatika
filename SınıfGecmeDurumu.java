import java.util.Scanner;
public class SınıfGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat,fizik,turkce,kimya,muzik;
        double average;
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextDouble();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextDouble();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextDouble();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextDouble();
        if((mat >=0 && mat <=100) && (fizik >=0 && fizik <=100) && (turkce >=0 && turkce <=100) &&
                (kimya >=0 && kimya <=100) && (muzik >=0 && muzik <=100) ){

            average =(mat+fizik+turkce+kimya+muzik)/5;
            if (average <= 55 ){
                System.out.println("Sinifta kaldiniz.");
            } else {
                System.out.println("Sinifi gectiniz. Tebrikler! ");
            } System.out.println("Ortalamaniz = " + average);

        } else {
            System.out.println("Ortalama Hesaplamasina Katilamaz");
        }



    }
}


