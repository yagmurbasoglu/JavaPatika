import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        int year;
        year = input.nextInt();

        if (year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " bir artik yildir");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " bir artik yil degildir");
        }

        if (year % 100 != 0 && year % 4 == 0){
            System.out.println(year + " bir artik yildir");
        } else if (year % 100 != 0 && year % 4 != 0) {
            System.out.println(year + " bir artik yil degildir");
        }

    }

    }

