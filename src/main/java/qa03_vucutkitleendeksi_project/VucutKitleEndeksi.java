package qa03_vucutkitleendeksi_project;

import java.util.Scanner;

public class VucutKitleEndeksi {

            /*Eğer Vücut Kitle İndeksi .
            Formül : Kilo (kg) / Boy(m) * Boy(m)

            18.5'ten küçükse ekrana "Zayıf"
            18.5 ile 24.9 arasında ise ekrana "İdeal"
            25 ile 29.9 arasında ise ekrana "Şişman"
            30 ile 34.9 arasında ise ekrana "Obez"
            35'ten büyükse ise ekrana "Aşırı Obez" yazsın.*/

    public static void main(String[] args) {

        double bodyWeight = 0;
        double height = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen vucut agirlignizi giriniz : ");
        bodyWeight = input.nextDouble();

        System.out.println("Lutfen boyunuzu ( metre cinsinden ) giriniz : ");
        height = input.nextDouble();

        double vke = bodyWeight / (height * height);
        System.out.println("Vucut kitle Endeksiniz : " + vke);

        if (vke < 18.5) {
            System.out.println("Zayif");
        } else if (vke >= 18.5 && vke < 24.9) {
            System.out.println("Ideal");
        } else if (vke >= 25 && vke < 29.9) {
            System.out.println("Sisman");
        } else if (vke >= 30 && vke < 34.9) {
            System.out.println("Obez");
        } else if (vke >= 35 && vke < 34.9) {
            System.out.println("Asiri Obez");
        } else {
            System.out.println("Yanlis sayi girdiniz");
        }
    }
}
