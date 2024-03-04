package chapter3;

import java.util.Scanner;

public class S19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen x1 noktasını giriniz :");
        double x1 = scan.nextDouble();
        System.out.print(" Lütfen y1 noktasını giriniz :");
        double y1 = scan.nextDouble();
        System.out.print(" Lütfen x2 noktasını giriniz :");
        double x2 = scan.nextDouble();
        System.out.print(" Lütfen y2 noktasını giriniz :");
        double y2 = scan.nextDouble();
        System.out.print(" Lütfen x3 noktasını giriniz :");
        double x3 = scan.nextDouble();
        System.out.print(" Lütfen y3 noktasını giriniz :");
        double y3 = scan.nextDouble();

        double uzunluk1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double uzunluk2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double uzunluk3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double ucgenCevresi = uzunluk1 + uzunluk2 + uzunluk3;

        if (uzunluk1 + uzunluk2 > uzunluk3) {
            System.out.println(" Girdiğiniz değerler üçgen oluşturur. Ve oluşan üçgenin çevresi :" + ucgenCevresi);
        } else if (uzunluk2 + uzunluk3 > uzunluk1) {
            System.out.println(" Girdiğiniz değerler üçgen oluşturur. Ve oluşan üçgenin çevresi :" + ucgenCevresi);
        } else if (uzunluk1 + uzunluk3 > uzunluk2) {
            System.out.println(" Girdiğiniz değerler üçgen oluşturur. Ve oluşan üçgenin çevresi :" + ucgenCevresi);
        } else if (uzunluk1 + uzunluk2 + uzunluk3 == 0) {
            System.out.println(" Girdiğiniz değerler üçgen oluşturmaz. Lütfen tekrar deneyinizz  ");
        }
    }
}
