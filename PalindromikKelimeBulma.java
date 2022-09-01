import java.util.Scanner;

public class PalindromikKelimeBulma {
    static boolean isPalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        while (!word.equals("0")){
            System.out.print("Kelimeyi yaziniz : ");
            word= input.nextLine();

            if (isPalindrom(word)&&!word.equals("0")){
                System.out.println( word + " palindrom bir kelimedir.");
            } else if (!isPalindrom(word) && !word.equals("0")) {
                System.out.println( "(" + word + ")" + " palindrom bir kelime degildir.");
            }
            System.out.println();
        System.out.println("Program sonlandirildi!");
        }
    }
}
