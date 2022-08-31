import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int num = input.nextInt();
        int[] list = new int[num];
        System.out.println("Dizinin elemanlarini giriniz : ");
        int count=0;
        while (count< list.length){
            System.out.print((count+1) + ". Elemani : ");
            int n = input.nextInt();
            list[count++]=n;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
