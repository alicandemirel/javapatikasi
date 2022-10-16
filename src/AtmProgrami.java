import java.util.Scanner;

public class AtmProgrami {
    public static void main(String[] args) {

        String username, password;
        int select, balance = 0, right = 3, price;


        Scanner input = new Scanner(System.in);

        while (right > 0) {

            System.out.print("Lütfen kullanıcı adını giriniz: ");
            username = input.nextLine();
            System.out.print("Lütfen şifre giriniz: ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {

                System.out.println("Başarılı bir şekilde giriş yaptınız...");
                do {

                    System.out.println("1- Para yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap ");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();


                    switch (select) {

                        case 1:

                            System.out.print("Eklemek istediğiniz para miktarı: ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarı: ");
                            price = input.nextInt();


                            if (price > balance) {
                                System.out.print("Bakiye yetersiz");
                            } else {
                                balance -= price;
                                System.out.print("Hesabınızdan " + price + " TL çekilmiştir.");
                            }
                            break;

                        case 3:
                            System.out.print("Bakiyeniz: " + balance);
                            break;

                        default:
                            System.out.print("Çıkış başarılı bir şekilde gerçekleşti. ");
                            break;

                    }

                    break;


                } while (select != 4);



            } else {

                right--;
                System.out.println("Kullanıcı adı veya şifre yanlış,tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                } else {

                    System.out.println("Kalan hakkınız: " + right);

                }

            }
        }


    }


}
