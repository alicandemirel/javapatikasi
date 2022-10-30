import java.util.Scanner;

public class UsAlmaProject {


    static int UsAlma(int a, int b) {


        int total = 0;

        for (int i = 1; i <= b; i++) {

            total *= a;


        }
        System.out.println("Sonuç: " + total );
        return a;



    }



    public static void main(String[] args) {

        UsAlma(2,3);

    }


}
