package chapter3;

import java.util.Scanner;

public class S29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Çember 1'in x  y koordinatlarını ve yarıçap uzunluğunu giriniz :");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double r1 = scan.nextDouble();

        System.out.println(" Çember 2'nin x y koordinatlarını ve yarıçap uzunluğunu giriniz : ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double r2 = scan.nextDouble();

        double x1max = r1 + x1;  // Çemberin durumunu belirlemek için kullanılır.
        double y1max = r1 + y1;  // Çemberin durumunu belirlemek için kullanılır.
        double x1min = x1 - r1;  // Çemberin durumunu belirlemek için kullanılır.
        double y1min = y1 - r1;  // Çemberin durumunu belirlemek için kullanılır.
        double x2max = x2 + r2;  // Çemberin durumunu belirlemek için kullanılır.
        double y2max = y2 + r2;  // Çemberin durumunu belirlemek için kullanılır.
        double x2min = x2 - r2;  // Çemberin durumunu belirlemek için kullanılır.
        double y2min = y2 - r2;  // Çemberin durumunu belirlemek için kullanılır.

        if (x1max == x2max && x1min == x2min && y1max == y2max && y1min == y2min) {
            System.out.println(" Bu çemberler eş çemberlerdir ");
        } else if (x1max <= x2max && x1min >= x2min && y1max <= y2max && y1min >= y2min) {
            System.out.print("R1 çemberi R2 çemberinin içindedir ");
        } else if ((x1max < x2min) || (x1min > x2max) || (y1max < y2min) || (y2min > y1max)) {
            System.out.println(" R2 çemberi R1 çemberi ile kesişmiyor ");
        } else if (x2max <= x1max && x2min >= x1min && y2max <= y1max && y2min >= y1min) {
            System.out.println(" R2 çemberi R1 çemberinin içindedir ");
        } else {
            System.out.println(" R2 çemberi R1 çemberi ile kesişiyor ");
        }

    }
}
