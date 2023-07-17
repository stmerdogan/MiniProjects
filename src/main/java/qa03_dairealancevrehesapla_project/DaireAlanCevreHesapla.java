package qa03_dairealancevrehesapla_project;

import java.util.Scanner;

public class DaireAlanCevreHesapla {
    public static void main(String[] args) {

        double area;
        double perimeter;
        double circleSliceArea;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yaricap giriniz");
        double radius = input.nextDouble();

        System.out.println("Lutfen merkez aci  giriniz");
        double centerAngle = input.nextDouble();

        //Daire Alan Formülü : π * r * r

        //Daire Çevre Formülü : 2 * π * r

        area = 3.14 * radius * radius;
        System.out.println("Dairenin alani : " + area);

        perimeter = 2 * 3.14 * radius;
        System.out.println("Dairenin cevresi : " + perimeter);

        //Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.
        // π Sayısını = 3,14 alın.
        // Formül : (π  * (r*r) *a) / 360)

        circleSliceArea = (3.14 * (radius * radius) * centerAngle / 360);
        System.out.println("Daire dilimi Alani : " + circleSliceArea);
    }
}
