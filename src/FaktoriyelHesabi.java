import java.util.Scanner;

public class FaktoriyelHesabi {

    public static void main(String[] args) {


        int f, g, total = 1, total2 = 1, total3 = 1, z, t,q,m;

        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyeli alınması istenen ilk sayıyı giriniz: ");
        f = input.nextInt();


        System.out.print("Faktöriyeli alınması istenen ikinci sayıyı giriniz: ");
        g = input.nextInt();
        System.out.print(f + " Sayısının faktöriyeli: ");




        for (int i = 1; i <= f; f--) {

            if (f == 1) {

                System.out.print(f);
                total *= f;

            } else {
                System.out.print(f + " x ");
                total *= f;
            }


        }
        System.out.println(", Sonuç: " + total);

        System.out.print(g + " Sayısının faktöriyeli: ");

        for (int k = 1; k <= g; g--) {

            if (g == 1) {

                System.out.print(g);
                total *= g;

            } else {
                System.out.print(g + " x ");
                total2 *= g;
            }


        }
        System.out.println(", Sonuç: " + total2);

        t = f - g;


        for (int y = 1; y <= t; t--) {

            if (t == 1) {

                System.out.print(t);
                total *= t;

            } else {
                System.out.print(t + " x ");
                total3 *= t;
            }


        }

        z = total / (total2 * (total3));

        System.out.println("İkili kombinasyon sonucu = " + z);
    }
}
