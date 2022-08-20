import java.util.Scanner;

public class PalindromSayi {
   public static void isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println("Palindrom Sayidir.");

        } else {
            System.out.println("Palindrom Sayi Degildir.");

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom olup olmadigini kontrol etmek istediginiz sayiyi giriniz: ");
        int number = input.nextInt();
        isPalindrom(number);

    }
}
