import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugunuz ayi giriniz : ");
        int month;
        month = input.nextInt();
        System.out.print("Dogdugunuz gunu giriniz : ");
        int day;
        day = input.nextInt();

        if (month ==1 ){
            if (day<22) System.out.print("Oğlak");
            else System.out.print("Kova");
        } else if (month == 2){
            if (day<20) System.out.print("Kova");
            else System.out.print("Balık");
        } else if (month == 3) {
            if (day<21) System.out.print("Balık");
            else System.out.print("Koç");
        }else if (month == 4) {
            if (day < 21) System.out.println("Koç");
            else System.out.println("Boğa");
        }else if (month == 5) {
            if (day < 22) System.out.println("Boğa");
            else System.out.println("İkizler");
        } else if (month == 6) {
            if (day < 23) System.out.println("İkizler");
            else System.out.println("Yengeç");
        } else if (month == 7) {
            if (day < 23) System.out.println("Yengeç");
            else System.out.println("Aslan");
        } else if (month == 8) {
            if (day < 23) System.out.println("Aslan");
            else System.out.println("Başak");
        } else if (month == 9) {
            if (day < 23) System.out.println("Başak");
            else System.out.println("Terazi");
        } else if (month == 10) {
            if (day < 23) System.out.println("Terazi");
            else System.out.println("Akrep");
        } else if (month == 11) {
            if (day < 22) System.out.println("Akrep");
            else System.out.println("Yay");
        } else if (month == 12){
            if (day<22) System.out.print("Yay");
            else System.out.print("Oğlak");
        }
    }
}
