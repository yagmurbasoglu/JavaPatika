import java.util.Scanner;

public class RecursiveUslu {
    static int pow(int base, int exponent) {
        int total = 1;
        if (base == 0 && exponent == 0) {
            System.out.println("Belirsiz.Tekrar Deneyin.");
        } else if (base == 0 && exponent > 0) {
            total = 0;
        }
        for (int i = 1; i <= exponent; i++) {
            total *= base;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri giriniz : ");
        int x = input.nextInt();
        System.out.print("Us degeri giriniz : ");
        int y = input.nextInt();
        System.out.println("Sonuc : " + pow(x, y));
        System.out.println("Islem bitmistir.");
    }
}
