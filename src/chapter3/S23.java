package chapter3;

import java.util.Scanner;

public class S23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Lütfen x noktasını giriniz : ");
        double x = scan.nextDouble();
        System.out.print(" Lütfen y noktasını giriniz : ");
        double y = scan.nextDouble();

        boolean kontrol = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) ||
                (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

        System.out.println("Noktalar şu şekildedir : (" + x + ", " + y + ")  " +
                (" =>") + "  Bu noktalar dikdörtgenin içindedir ");
    }
}
