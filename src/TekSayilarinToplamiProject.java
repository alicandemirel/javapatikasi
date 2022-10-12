import java.util.Scanner;

public class TekSayilarinToplamiProject {

    public static void main(String[] args) {

        int n;
        int total = 0;

        Scanner input = new Scanner(System.in);


        do {
            System.out.print("lütfen bir sayı giriniz: ");
            n = input.nextInt();
            if (n % 2 != 1) {
                total += n;

            }
        }


        while (n % 2 != 1);


        System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıların toplamı " + total);


    }
}
