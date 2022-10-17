import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number = 0, total = 0, variable = 1;

        for (int i = 0; i <= 8; i++) {

            total = total + variable;
            variable = total - variable;
            number = total;

            if (i == 8) {

                System.out.print(number);
            } else {

                System.out.print(number + ", ");
            }


        }
    }
}
