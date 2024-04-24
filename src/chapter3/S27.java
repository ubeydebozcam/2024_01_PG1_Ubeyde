package chapter3;

import java.util.Scanner;

public class S27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Lütfen x noktasını giriniz : ");
        double x = scan.nextDouble();
        System.out.print(" Lütfen y noktasını giriniz : ");
        double y = scan.nextDouble();

        double xkesenNokta = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double ykesenNokta = (-y * (200 * 100)) / (-y * 200 - x * 100);

        System.out.println(" Nokta " + ((x > xkesenNokta || y > ykesenNokta)
                ? "değil " : " dir " ) + " üçgenin içinde ");


    }
}
