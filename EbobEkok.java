import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ebob-Ekok hesaplanmasini istediginiz sayilari giriniz.");
        System.out.print("n1 sayisini giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        int n2 = input.nextInt();

        int i = 1;
        int ebob = 1;
        int k = 1;
        if (n1 < n2) {
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }

            }
            System.out.println("EBOB:" + ebob);
            System.out.println("EKOK: " + ((n1 * n2) / ebob));
        } else {
            while (i <= n2) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB:" + ebob);
            System.out.println("EKOK: " + ((n1 * n2) / ebob));

        }

    }
}



