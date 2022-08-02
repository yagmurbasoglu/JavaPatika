import java.util.Scanner;

public class SıcaklıkHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.println("Sicaklik secimini yapiniz.\n1)5'den kucuk\n2) 5 ve 15 arasinda \n3)15 ve 25 arasinda\n4)25'ten buyuk");
        System.out.print("Secim: ");
        heat = input.nextInt();

        switch (heat){
            case 1 :
                System.out.print("Kayak yapabilirsiniz.");
                break;
            case 2 :
                System.out.print("Sinemaya gidebilirsiniz.");
                break;
            case 3 :
                System.out.print("Piknik yapabilirsiniz.");
                break;
            case 4 :
                System.out.print("Yuzmeye gidebilirsiniz.");
                break;
            default:
                System.out.print("Yanlis girdiniz.Lutfen tekrar deneyiniz.");
        }
    }
}
