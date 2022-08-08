import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sinir Sayisi Giriniz : ");
        int n;
        n = input.nextInt();

        System.out.println("Dordun Kuvvetleri : ");
        for (int i=1 ; i<=n; i*=4){
            System.out.println(i);
        }
        System.out.println("Besin Kuvetleri : ");
        for (int i=1 ;i<=n;i*=5){
            System.out.println(i);
        }


    }
}
