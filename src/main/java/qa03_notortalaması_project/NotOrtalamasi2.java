package qa03_notortalaması_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotOrtalamasi2 {
    static Scanner scan = new Scanner(System.in);

    public static int ortalamahesepla() {

        int ortalama = 0;
            ortalama = (fiziknotualma() + kimyanotualma() + matematiknotualma() + turkcenotualma() +
                    tarihnotualma() + muziknotualma() / 6);
            System.out.println("Not Ortalamanız = " + ortalama);

            String sonuc = (ortalama >= 60) ? "geçti " : "kaldı";
            System.out.println(sonuc);
        return ortalama;
        }


    private static int muziknotualma() {
        int a = 0;
        try {
            System.out.println("Müzik notunu giriniz =");
            a = scan.nextInt();

            if (a < 0 || a > 100) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! 0 ila 100 arasında bir not giriniz.");
            scan.nextLine();
            a = muziknotualma();
        }
        return a;
    }

    private static int tarihnotualma() {
        int a = 0;
        try {
            System.out.println("Tarih notunu giriniz =");
            a = scan.nextInt();

            if (a < 0 || a > 100) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! 0 ila 100 arasında bir not giriniz.");
            scan.nextLine();
            a = tarihnotualma();
        }
        return a;
    }

    private static int turkcenotualma() {
        int a = 0;
        try {
            System.out.println("Türkçe notunu giriniz =");
            a = scan.nextInt();

            if (a < 0 || a > 100) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! 0 ila 100 arasında bir not giriniz.");
            scan.nextLine();
            a = turkcenotualma();
        }
        return a;
    }

    private static int fiziknotualma() {
        int a = 0;
        try {
            System.out.println("Fizik notunu giriniz =");
            a = scan.nextInt();

            if (a < 0 || a > 100) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! 0 ila 100 arasında bir not giriniz.");
            scan.nextLine();
            a = fiziknotualma();
        }
        return a;
    }

    public static int matematiknotualma() {
        int a = 0;
        try {
            System.out.println("Matematik notunu giriniz =");
            a = scan.nextInt();

            if (a < 0 || a > 100) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! 0 ila 100 arasında bir not giriniz.");
            scan.nextLine();
            a = matematiknotualma();
        }
        return a;
    }

    public static int kimyanotualma() {
        int a = 0;
        try {
            System.out.println("Kimya notunu giriniz =");
            a = scan.nextInt();

            if (a < 0 || a > 100) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! 0 ila 100 arasında bir not giriniz.");
            scan.nextLine();
            a = kimyanotualma();
        }
        return a;
    }
}