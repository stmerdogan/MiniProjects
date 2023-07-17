package qa03_manavsepettutar_project;

import java.util.Scanner;

public class ManavSepetTutar {
    public static void main(String[] args) {
        calculateTotalPrice();
    }

    private static double calculateTotalPrice() {
        double cucumberKg = 3.14;
        double appleKg = 4.11;
        double zucciniKg = 2.22;
        double tomatoKg = 0.95;
        double eggplantKg = 7.00;
        double toplamTutar = 0.0;

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Kac kg salatalik aldiniz");
            double cucumber = input.nextDouble();

            System.out.println("Kac kg elma aldiniz");
            double apple = input.nextDouble();

            System.out.println("Kac kg kabak aldiniz");
            double zuccini = input.nextDouble();

            System.out.println("Kac kg domates aldiniz");
            double tomato = input.nextDouble();

            System.out.println("Kac kg patlican aldiniz");
            double eggplant = input.nextDouble();

            toplamTutar = (cucumberKg * cucumber) + (appleKg * apple) + (zucciniKg * zuccini) +
                    (tomatoKg * tomato) + (eggplantKg * eggplant);
            System.out.println("Toplam tutar: " + toplamTutar);
        } catch (Exception e) {
            System.out.println("Hatalı giriş yaptınız. Lütfen sayısal değerleri doğru formatta girin.");

            calculateTotalPrice();
        }

        return toplamTutar;

    }
}
