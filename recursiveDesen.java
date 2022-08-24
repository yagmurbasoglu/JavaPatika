import java.util.Scanner;

public class recursiveDesen {

    static int desen1(int num) {
        if (num <= 0){
            return num;
        }
        else {
            System.out.print(num + " ");
            return desen1(num-5);
        }
    }

    static int desen2(int num,int newNum) {
        if(num > newNum){
            return num;
        }
        else {
            System.out.print(num + " ");
            return desen2(num+5,newNum);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Sayiyi giriniz : ");
            int number = input.nextInt();
            desen2(desen1(number),number);

            }


    }
