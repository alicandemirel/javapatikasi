import java.util.Scanner;

public class UcakBiletiHesaplamaProject {
    public static void main(String[] args) {

        int distance, age, choice;
        double perDistance = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz: ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz: \n1 - Tek Yön / 2 - Gidiş Dönüş: ");
        choice = input.nextInt();

        if (distance > 0) {

            if (age <= 12) {
                switch (choice) {
                    case 1:
                        System.out.print("Uçuşun toplam fiyatı: " + (distance * perDistance) * (0.5) + " TL");
                        break;

                    case 2:
                        System.out.print("Uçuşun toplam fiyatı: " + 2 * (distance * perDistance * 0.8) * (0.5) + " TL");
                        break;

                    default:
                        System.out.print("Hatalı veri girdiniz!");
                }
            } else if (age > 12 && age <= 24) {
                switch (choice) {
                    case 1:
                        System.out.print("Uçuşun toplam fiyatı: " + (distance * perDistance) * (0.9) + " TL");
                        break;

                    case 2:
                        System.out.print("Uçuşun toplam fiyatı: " + 2 * (distance * perDistance * 0.8) * (0.9) + " TL");
                        break;

                    default:
                        System.out.print("Hatalı veri girdiniz!");
                }


            } else if (age > 24 && age <= 65) {

                switch (choice) {
                    case 1:
                        System.out.print("Uçuşun toplam fiyatı: " + (distance * perDistance) + " TL");
                        break;

                    case 2:
                        System.out.print("Uçuşun toplam fiyatı: " + 2 * (distance * perDistance * 0.8) + " TL");
                        break;

                    default:
                        System.out.print("Hatalı veri girdiniz!");
                }


            } else if (age > 65) {
                switch (choice) {
                    case 1:
                        System.out.print("Uçuşun toplam fiyatı: " + (distance * perDistance) * (0.7) + " TL");
                        break;

                    case 2:
                        System.out.print("Uçuşun toplam fiyatı: " + 2 * (distance * perDistance * 0.8) * (0.7) + " TL");
                        break;

                    default:
                        System.out.print("Hatalı veri girdiniz!");
                }
            }

        } else {
            System.out.print("Hatalı veri girdiniz!");
        }


    }

}
