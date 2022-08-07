import java.util.Scanner;

public class CiftVeDordunKati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, total=0;
        do {
            System.out.print("Bir Sayi Giriniz : ");
            i = input.nextInt();
            if (i % 2 == 0 && i % 4 == 0){
                total +=i;
            }
        } while (i % 2 == 0);
        System.out.print("Toplam : "+total);
    }
}
