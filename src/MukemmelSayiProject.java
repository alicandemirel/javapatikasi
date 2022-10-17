import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class MukemmelSayiProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, counter, basValue, total2 = 3;


        while (total2 > 0) {


            int total1 = 0;
            System.out.print("Please enter the number: ");
            number = input.nextInt();


            for (int i = 1; i <= number; i++) {

                if (number % i == 0 && number != i) {

                    total1+=i;
                }

            }
            if (total1 == number) {

                System.out.println(number + ", mükemmel sayıdır.");


            } else {

                System.out.println(number + ", mükemmel sayı değildir.");
            }

            total2--;
        }

    }
}
