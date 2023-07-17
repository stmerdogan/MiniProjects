package qa03_notortalaması_project;

import java.util.Scanner;

public class NotOrtalamasi2 {
    static Scanner scan = new Scanner(System.in);

    public static int ortalamahesepla() {
        int ortalama = 0;
        ortalama = (fiziknotualma() + kimyanotualma() + matamatiknotualma() + turkcenotualma() +
                tarihnotualma() + muziknotualma()) / 6;
        System.out.println("Not Ortalamanız = " + ortalama);

        String sonuc = (ortalama >= 60) ? "geçti " : "kaldı";
        System.out.println(sonuc);
        return ortalama;

    }

    public static int matamatiknotualma() {
        //Scanner scan = new Scanner(System.in);
        System.out.println("matematik notunu giriniz =");
        int a = scan.nextInt();

        if (a < 0 || a > 100) {

            System.out.println("0 ila 100 arası bir not giriniz");
            int b = scan.nextInt();

            a = b;

        }
        return a;

    }

    public static int kimyanotualma() {
        //Scanner scan = new Scanner(System.in);
        System.out.println("Kimya notunu giriniz =");
        int a = scan.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("0 ila 100 arası bir not giriniz");
            int b = scan.nextInt();
            a = b;

        }
        return a;
    }

    private static int fiziknotualma() {

        //Scanner scan = new Scanner(System.in);
        System.out.println("Fizik notunu giriniz =");
        int a = scan.nextInt();

        if (a < 0 || a > 100) {

            System.out.println("0 ila 100 arası bir not giriniz");
            int b = scan.nextInt();
            a = b;

        }
        return a;

    }

    private static int turkcenotualma() {
        // Scanner scan = new Scanner(System.in);
        System.out.println("Turkce notunu giriniz =");
        int a = scan.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("0 ila 100 arası bir not giriniz");
            int b = scan.nextInt();
            a = b;

        }
        return a;

    }

    private static int muziknotualma() {
        // Scanner scan = new Scanner(System.in);
        System.out.println("Müzik notunu giriniz =");
        int a = scan.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("0 ila 100 arası bir not giriniz");
            int b = scan.nextInt();
            a = b;

        }
        return a;
    }

    private static int tarihnotualma() {
        //Scanner scan = new Scanner(System.in);
        System.out.println("Tarih notunu giriniz =");
        int a = scan.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("0 ila 100 arası bir not giriniz");
            int b = scan.nextInt();
            a = b;

        }
        return a;
    }
}