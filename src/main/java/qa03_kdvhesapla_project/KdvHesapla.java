package qa03_kdvhesapla_project;

import java.util.Scanner;

public class KdvHesapla {

    /*KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %18 , tutar 500TL'den büyük
     ise KDV oranını %8 olarak KDV hesaplayan programı yazınız.
     */
   static Scanner scan = new Scanner(System.in);

    public static void cikis() {

        System.out.println("Kdv hesaplamak için 1'e basınız");
        System.out.println("Çıkış yapmak için 2'e  basınız.");
        String secim = scan.nextLine();

        if (secim.equals("1")) {
            kdvhesapla();

        } else if (secim.equals("2")) {
            System.out.println("Çıkış yapıldı.");
        }
    }
    public static void kdvhesapla() {

        int kdvlifiyat;
        int kdv;
        System.out.println("Aldığınız ürünün fiyatını giriniz =");
        int urunfiyati = scan.nextInt();

        if (urunfiyati > 0 && urunfiyati < 500) {
            kdv = (urunfiyati * 18) / 100;
            System.out.println("Ürünün kdv'si = " + kdv + " tl");
            kdvlifiyat = urunfiyati + ((urunfiyati * 18) / 100);
            System.out.println("Ürünün kdv'li fiyatı =" + kdvlifiyat + " tl");

        } else if (urunfiyati >= 500) {
            kdv = (urunfiyati * 8) / 100;
            System.out.println("Ürünün kdv'si = " + kdv + " tl");
            kdvlifiyat = urunfiyati + ((urunfiyati * 8) / 100);
            System.out.println("Ürünün kdv'li fiyatı =" + kdvlifiyat + " tl");

        } else if (urunfiyati < 0) {
            System.out.println("yanlış giriş yaptınız");
        }
        cikis();
    }
}
