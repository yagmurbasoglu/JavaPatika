import java.util.Scanner;
public class Odev2KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOrani, uygulanacakKdv, kdvliTutar,kdvSecimi;
        System.out.print("URUN TUTARI = ");
        tutar = input.nextDouble();
        boolean kosul1 = tutar >= 1000;
        kdvSecimi = kosul1 ? 8 : 18;

        uygulanacakKdv = (tutar*kdvSecimi )/100;
        kdvliTutar = tutar+uygulanacakKdv;
        kdvOrani = kdvSecimi;


        System.out.println("kdvsiz fiyat = " + tutar);
        System.out.println("kdvli fiyat = " + kdvliTutar);
        System.out.println("kdv = " + uygulanacakKdv);
        System.out.println("kdv orani = " + kdvOrani);







    }
}
