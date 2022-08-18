import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz: ");
        int n = input.nextInt();

        int max = 0, min = 0;

        for (int i = 1; i <= 4; i++){
            System.out.print(i + ". Sayiyi giriniz: ");
            int number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;

            }

        }
        System.out.println("En buyuk sayi:" + max);
        System.out.println("En kucuk sayi: "+ min);
    }
}
