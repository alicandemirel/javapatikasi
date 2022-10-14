import java.util.Scanner;

public class UsluSayiProject {
    public static void main(String[] args) {

        int n,k, toplam=1;

        Scanner input = new Scanner(System.in);

        System.out.print("üssü alınacak sayıyı giriniz: ");
        n=input.nextInt();
        System.out.print("üs olacak sayıyı giriniz: ");
        k=input.nextInt();

        for (int i=1; i<=k; i++){

            if (i==k) {

                System.out.print(n);


            }else {

                System.out.print(n + " x ");
            }
            toplam *= n;

        }
            System.out.println(" = üs işlemi sonucu: " + toplam);
    }
}
