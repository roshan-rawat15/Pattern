import java.util.*;

public class patt3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;

        //outer loop
         for(int i=1; i<=n; i++)
         {
            for(int j=1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
         }
    }
}