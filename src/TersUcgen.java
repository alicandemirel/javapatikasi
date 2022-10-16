import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int basamakSayisi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        basamakSayisi = inp.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * (basamakSayisi - i)) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
