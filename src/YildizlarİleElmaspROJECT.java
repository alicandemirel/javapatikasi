import java.util.Scanner;

public class YildizlarİleElmaspROJECT {
    public static void main(String[] args) {

        int basamak;
        int basamak2;

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        basamak = input.nextInt();


        for (int i = 1; i <= basamak; i++) {

            for (int k = 1; k <= (basamak - i); k++) {


                System.out.print(" ");

            }


            for (int j = 1; j <= (2 * i) - 1; j++) {


                System.out.print("*");

            }
            System.out.println();

        }

        for (int i = 4; i >= 1; i--) {

            for (int k = 1; k <= (basamak - i); k++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }






            /*for (i = 6 - 1; i > 0; i--) {
                for (int k = 1; k <= (basamak2 - i); k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");

                }
                System.out.println("");


            }*/


    }
}
