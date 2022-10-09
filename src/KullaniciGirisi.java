import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password, newPassword;
        String sorgu;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adı giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen şifre giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {

            System.out.print("Başarılı bir giriş yaptınız...");
        } else {

            System.out.println("Girilen bilgiler yanlış...");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? E/H: ");
            sorgu = input.nextLine();

            if (sorgu.equals("E")) {

                System.out.print("Lütfen yeni şifre giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {

                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {

                    System.out.print("Şifre oluşturuldu.");

                }


            }

        }


    }
}
