import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        double n1, n2;
        int selection;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        n1 = input.nextDouble();
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        n2 = input.nextDouble();
        System.out.println("Lütfen yapmak istediğiniz işlemi giriniz: ");
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme: ");
        selection = input.nextInt();


        switch (selection) {

            case 1:
                System.out.println("Toplama işleminizin sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işleminizin sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işleminizin sonucu: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme işleminizin sonucu: " + (n1 / n2));
                } else {
                    System.out.println("Sıfıra bölünemez");
                }
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyiniz. ");

        }
    }
}
