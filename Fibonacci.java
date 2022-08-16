import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman Sayisini Giriniz: ");
        int e = input.nextInt();

        int n1=0 , n2=1, n3;

        for (int i =1 ;i<=e-1;i++) {
            n3=n2+n1;
            System.out.print(n1+ "+"+n2+ "="+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }
    }
}
