import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harmonik serisini bulmak istediginiz sayi :  ");
        int number = input.nextInt();
        double result = 0;
        for (double i =1 ;i<=number;i++){
            result += (1/i);
        }
        System.out.print("Harmonik Seri : " + result);

    }
}
