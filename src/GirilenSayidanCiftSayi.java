import java.util.Scanner;

public class GirilenSayidanCiftSayi {
    public static void main(String[] args) {

        int k, ortalama;
        int sayac = 0;
        int i = 1;
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz: ");
        k = input.nextInt();

        for (i = 1; i <= k; i++) {

            if (i % 3 == 0 && i % 4 == 0) {

                System.out.println(i);

                toplam += i;
                sayac++;
            }
        }
        System.out.println("0 ve " + k + " arasında 3 ve 4' e tam bölünebilen " + sayac + " adet sayı vardır. " +
                "Ve toplamları: " + toplam +
                ", ortalamaları: " + (toplam / sayac));

    }
}
