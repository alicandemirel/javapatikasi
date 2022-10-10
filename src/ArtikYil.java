import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        int artikYil;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Yılı giriniz: ");
        artikYil = input.nextInt();


        if (artikYil % 4 == 0) {
            if (artikYil % 100 == 0) {
                if (artikYil % 400 == 0)
                    isError = true;
                else
                    isError = false;
            } else
                isError = true;
        } else
            isError = false;

        if (isError)
            System.out.println(artikYil + " artık yıldır.");
        else
            System.out.println(artikYil + " artık yıl değildir.");


    }
}
