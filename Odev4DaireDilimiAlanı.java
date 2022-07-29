import java.util.Scanner;

public class Odev4DaireDilimiAlanı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14;
        double 𝛼;
        System.out.print("Dairenin yaricapini giriniz: ");
        r= input.nextInt();
        System.out.println("Dairenin merkez acisinin olcusunu giriniz: ");
        𝛼 = input.nextDouble();
        double alan =(pi * (r*r) * 𝛼) / 360;
        System.out.println("Daire Diliminin Alani " + alan);


    }
}
