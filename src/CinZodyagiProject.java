import java.util.Scanner;

public class CinZodyagiProject {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();

        if (year % 12 == 0) {

            System.out.print("Çin Zodyak Burcunuz: Maymun");

        } else if (year % 12 == 1) {

            System.out.print("Çin Zodyak Burcunuz: Horoz");

        } else if (year % 12 == 2) {

            System.out.print("Çin Zodyak Burcunuz: Köpek");
        } else if (year % 12 == 3) {

            System.out.print("Çin Zodyak Burcunuz: Domuz");
        } else if (year % 12 == 4) {

            System.out.print("Çin Zodyak Burcunuz: Fare");
        } else if (year % 12 == 5) {

            System.out.print("Çin Zodyak Burcunuz: Öküz");
        } else if (year % 12 == 6) {

            System.out.print("Çin Zodyak Burcunuz: Kaplan");
        } else if (year % 12 == 7) {

            System.out.print("Çin Zodyak Burcunuz: Tavşan");
        } else if (year % 12 == 8) {

            System.out.print("Çin Zodyak Burcunuz: Ejderha");
        } else if (year % 12 == 9) {

            System.out.print("Çin Zodyak Burcunuz: Yılan");
        } else if (year % 12 == 10) {

            System.out.print("Çin Zodyak Burcunuz: At");
        } else if (year % 12 == 11) {

            System.out.print("Çin Zodyak Burcunuz: Koyun");
        }else {

            System.out.print("Hatalı giriş!");
        }
    }
}
