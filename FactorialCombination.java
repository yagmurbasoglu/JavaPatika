import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class FactorialCombination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ,r ;
        System.out.print("C(n,r) icin n degeri giriniz : ");
        n=input.nextInt();
        System.out.print("C(n,r) icin r degeri giriniz : ");
        r=input.nextInt();

        int nFact=1;
        for (int i=1 ;i<=n;i++){
            nFact *= i;
        }
        System.out.println("n! : " +nFact);
        int rFact=1;
        for (int k=1 ;k<=r;k++ ){
            rFact *= k;
        }
        System.out.println("r! : " +rFact);

        int nFarkR=(n-r), nFarkRFact=1;
        for (int m=1; m<=nFarkR ;m++ ){
            nFarkRFact*=m;
        }
        System.out.println("(n-r)! : "+nFarkRFact);

        int comb = nFact / (rFact*nFarkRFact);
        System.out.println("C(n,r) : "+comb);


    }
}
