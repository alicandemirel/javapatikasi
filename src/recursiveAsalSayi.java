import java.util.Scanner;

public class recursiveAsalSayi {

    static void asalSayi(int x) {

        boolean isError = false;

        for (int i = 2; i <= x; i++) {

            if (x % i == 0) {

                isError = true;
                break;

            }

            if (isError = false) {

                System.out.print(x + " Asal sayıdır.");
            } else {

                System.out.print(x + " Asal sayı değildir.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int x = input.nextInt();

        asalSayi(x);
    }
}

