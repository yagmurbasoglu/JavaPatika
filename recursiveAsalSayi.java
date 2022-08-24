import java.util.Scanner;

public class recursiveAsalSayi {
    static boolean asal(int number){
        boolean asal = true;
        for (int i=2;i<number;i++){
            if (number%i==0){
                asal=false;
                break;
            }
        }
        return asal;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n= input.nextInt();
        if(asal(n)){
            System.out.println(n+ " sayisi ASALDIR!" );
        }else {
            System.out.println(n+" sayisi ASAL degildir!");
        }


    }
}