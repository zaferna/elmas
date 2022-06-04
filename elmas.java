import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,i,k,j,l,m,z,p;
        System.out.print("n Sayisi Gir :");
        n = inp.nextInt();
        p=n-1;

        for(i=1;i<=n;i++){

            for(j=1;j<=n-i;j++){

                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){

                System.out.print("*");
            }


            System.out.println();
        }
        for(l=1;l<=n;l++){

            for(m=1;m<=l;m++){

                System.out.print(" ");
            }
            for(z=1;z<=2*(p-l)+1;z++) {
                System.out.print("*");
            }



        System.out.println();
    }


    }
}
