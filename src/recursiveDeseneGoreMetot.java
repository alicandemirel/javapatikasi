import java.util.Scanner;

public class recursiveDeseneGoreMetot {

    static int azalanDesen(int x) {


        if (x == 0 || x < 0) {
            return x;
        } else {

            System.out.print(x + "\t");
            return azalanDesen(x - 5);
        }

    }

    static int artanDesen(int x, int y) {

        if (x > y) {

            return x;
        } else {
            System.out.print(x + "\t");
            return artanDesen(x + 5, y);
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı: ");
        int x = input.nextInt();
        artanDesen(azalanDesen(x), x);
    }

}
