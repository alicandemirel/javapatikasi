import java.util.Scanner;

public class Harmonik {

    public static void main(String[] args) {


        int n;
        double result = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Harmonik seriye ait \"n\" sayısını giriniz: ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {

            result += (1 / i);
        }
        System.out.print(result);


    }
}
