import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        double boy;
        boy = input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        double kilo;
        kilo = input.nextDouble();

        double vki = (kilo / (boy * boy));
        System.out.println("Vucud Kitle Indeksiniz: "+vki);

    }
}
