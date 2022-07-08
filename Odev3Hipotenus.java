import java.util.Scanner;

public class Odev3Hipotenus {
    public static void main(String[] args) {
        double a,b,c,u,cevre,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenari Giriniz = ");
        a = input.nextDouble();
        System.out.print("2.Kenari Giriniz = ");
        b = input.nextDouble();
        System.out.print("3.Kenari Giriniz = ");
        c = input.nextDouble();

        u = (a+b+c)/2;
        cevre = (2*u);
        alan = Math.sqrt(u*((u-a)*(u-b)*(u-c)));
        System.out.print("Ucgenin Alani : "+ alan);



    }
}
