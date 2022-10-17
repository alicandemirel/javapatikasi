import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean isError = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isError = false;
                    break;
                }
            }
            if (isError == true) {

                System.out.print(i + ", ");
            }
        }
    }
}
