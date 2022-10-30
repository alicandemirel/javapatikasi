import java.util.Scanner;

public class recursiveUsAlma {

    static int usAlma(int x, int y) {


        if (x == 0) {

            return 1;

        } else {
            int result = (int) Math.pow(x, y);

            return result;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int x = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int y = input.nextInt();

        System.out.println("Sonuç: " + usAlma(x, y));

    }
}
