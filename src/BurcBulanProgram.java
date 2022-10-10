import java.util.Scanner;

public class BurcBulanProgram {

    public static void main(String[] args) {

        int day, month;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);


        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();

        if (month==1 && day<=31 && day>=1 ){

            if (day<=21){

            burc = "Oğlak";

            }else {

            burc = "Kova";

            }

        }else {

            isError = true;
        }

        if (month==2 && day<=28 && day>=1 ){

            if (day<=19){

                burc = "Kova";

            }else {

                burc = "Balık";

            }

        }else {

            isError = true;
        }

        if (month==3 && day<=31 && day>=1 ){

            if (day<=20){

                burc = "Balık";

            }else {

                burc = "Koç";

            }

        }else {

            isError = true;
        }

        if (month==4 && day<=30 && day>=1 ){

            if (day<=20){

                burc = "Koç";

            }else {

                burc = "Boğa";

            }

        }else {

            isError = true;
        }

        if (month==5 && day<=31 && day>=1 ){

            if (day<=21){

                burc = "Boğa";

            }else {

                burc = "İkizler";

            }

        }else {

            isError = true;
        }
        if (month==6 && day<=30 && day>=1 ){

            if (day<=22){

                burc = "İkizler";

            }else {

                burc = "Yengeç";

            }

        }else {

            isError = true;
        }

        if (month==7 && day<=31 && day>=1 ){

            if (day<=23){

                burc = "Yengeç";

            }else {

                burc = "Aslan";

            }

        }else {

            isError = true;
        }

        if (month==8 && day<=31 && day>=1 ){

            if (day<=22){

                burc = "Aslan";

            }else {

                burc = "Başak";

            }

        }else {

            isError = true;
        }

        if (month==9 && day<=30 && day>=1 ){

            if (day<=22){

                burc = "Başak";

            }else {

                burc = "Terazi";

            }

        }else {

            isError = true;
        }

        if (month==10 && day<=31 && day>=1 ){

            if (day<=22){

                burc = "Terazi";

            }else {

                burc = "Akrep";

            }

        }else {

            isError = true;
        }

        if (month==11 && day<=30 && day>=1 ){

            if (day<=21){

                burc = "Akrep";

            }else {

                burc = "Yay";

            }

        }else {

            isError = true;
        }

        if (month==12 && day<=31 && day>=1 ){

            if (day<=21){

                burc = "Yay";

            }else {

                burc = "Oğlak";

            }

        }else {

            isError = true;
        }

        System.out.print("Doğduğunuz ay: " + month + ". ay , " + "Doğduğunuz gün: " + day + ". günü, " + "Burcunuz: " + burc);

    }
}
