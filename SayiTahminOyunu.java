import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int select;
        int[] wrong = new int[5];
        boolean isWin = false;

        while (right < 5) {
            System.out.print("Lutfen tahminininzi giriniz: ");
            select = input.nextInt();

            if (select < 0 || select > 99) {
                System.out.println("Lutfen 0-100 arasinda bir sayi giriniz.");
                continue;

            }
            if (select == number) {
                System.out.println("Tebrikler dogru tahmin ! Tamin ettiğiniz sayi : " + select);
                isWin = true;
                break;
            } else {
                wrong[right] = select;
                right++;
                System.out.println("Hatali bir sayi girdiniz!");
                if (select > number) {
                    System.out.println(select + " sayisi,gizli sayidan buyuktur.");
                } else {
                    System.out.println(select + " sayisi gizli sayidan kucuktur.");
                }
                System.out.println("Kalan hak : " + (5 - right));
            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz ! ");
            System.out.println("Dogru sayi : "+number );
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }
    }
}
