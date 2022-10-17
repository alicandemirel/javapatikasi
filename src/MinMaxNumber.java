import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        int sayi, sayi2, enBuyuk = 0, enKucuk = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {

            System.out.print(i + ". sayıyı giriniz: ");
            sayi2 = input.nextInt();

            if (i == 1) {

                enBuyuk = sayi2;
                enKucuk = sayi2;
            } else {
                if (sayi2 > enBuyuk) {
                    enBuyuk = sayi2;
                } else if (sayi2 < enKucuk) {
                    enKucuk = sayi2;
                }

            }

        }

        System.out.print("En büyük sayı: " + enBuyuk + "\nEn küçük sayı: " + enKucuk);

    }
}
