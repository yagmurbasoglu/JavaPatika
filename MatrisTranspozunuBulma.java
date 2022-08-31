import java.util.Scanner;

public class MatrisTranspozunuBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satir sayisini girin: ");
        int row = input.nextInt();
        System.out.print("Sutun sayisini girin: ");
        int col = input.nextInt();

        int[][] list = new int[row][col];
        int[][] listTranspoze = new int[col][row];

        for(int i =0 ;i < row; i++){
            for(int j = 0 ; j< col; j++){
                System.out.print(i + ". satirin " + j + ". elemani : ");
                list[i][j]= input.nextInt();
            }
        }
        for(int i = 0 ; i< list.length; i++){
            for(int j = 0; j<list[i].length; j++){
                listTranspoze[j][i] = list[i][j];
            }
        }
        for (int i = 0; i <listTranspoze.length ; i++){
            for(int j = 0 ; j<listTranspoze[i].length;j++){
                System.out.print(listTranspoze[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}