package qa03_hipotenushesapla_project;

import java.util.Scanner;

public class HipotenusHesapla {
    public static void main(String[] args) {

        int kisaKenar,uzunKenar;
        double hipotenus,u,alan,alan2;

        Scanner input = new Scanner(System.in);

        System.out.println("1.Kenari giriniz : ");
        kisaKenar = input.nextInt();

        System.out.println("2.Kenari giriniz : ");
        uzunKenar = input.nextInt();

        hipotenus = Math.sqrt((kisaKenar*kisaKenar)+(uzunKenar*uzunKenar));

        System.out.println("Hipotenus : " + (int) hipotenus);

        u=(kisaKenar+uzunKenar+hipotenus)/2;
        alan =Math.sqrt( u*(u-hipotenus)*(u-kisaKenar)*(u-uzunKenar));
        System.out.println("üçgenin alanı: "+alan);
        // 2.yol taban*yükseklik/2
        alan2=(double) (kisaKenar*uzunKenar)/2;
        System.out.println("üçgenin alanı: 2. yol ile hesaplanan : "+alan2);














    }
}
