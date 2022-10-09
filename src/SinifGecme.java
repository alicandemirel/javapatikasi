import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double average;

        if (matematik>100 || matematik<0) {

            average = (fizik + turkce + kimya + muzik) / 5;

        }

        else if (fizik>100 || fizik<0) {

            average = (matematik + turkce + kimya + muzik) / 5;

        }

        else if (turkce>100 || turkce<0) {

            average = (fizik + matematik + kimya + muzik) / 5;

        }


        else if (kimya>100 || kimya<0) {

            average = (fizik + turkce + matematik + muzik) / 5;

        }


        else if (muzik>100 || muzik<0) {

            average = (fizik + turkce + kimya + matematik) / 5;

        }else {

            average = (fizik + turkce + kimya + muzik+matematik) / 5;
        }


        if (average > 55) {

                System.out.print("Geçtiniz, ortalamanız: " + average);
        } else {
                System.out.print("Kaldınız, ortalamanız: " + average);
        }


    }
}
