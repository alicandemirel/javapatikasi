import java.util.Scanner;

//Bir sayının basamak sayılarının toplamını hesaplayan program

public class BasamakSayilariToplami {
    public static void main(String[] args) {

        int sayi, numberCounter = 0, tempSayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayıları toplamını öğrenmek istediğiniz sayıyı giriniz: ");
        sayi = input.nextInt();

        tempSayi = sayi;
        int basValue;
        int basNumber = 0;
        int total = 0;


        while (tempSayi != 0) {

            numberCounter++;
            tempSayi /= 10;
            basNumber++;

        }
        tempSayi = sayi;

        while (tempSayi != 0) {

            basValue = tempSayi % 10;
            System.out.println(basValue);
            tempSayi /= 10;
            total += basValue;

        }
        System.out.println(sayi + ", basamak sayıları toplamı: " + total);


    }
}
