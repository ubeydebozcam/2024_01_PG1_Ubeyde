package chapter3;

import java.util.Scanner;

public class S28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lütfen r1 dikdörtgeninin x ve y noktalarını giriniz ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println(" Lütfen r1 dikdörtgeninin enini giriniz ");
        double w1 = scan.nextDouble();
        System.out.println(" Lütfen r1 dikdörtgeninin uzunluğunu giriniz :");
        double h1 = scan.nextDouble();
        w1 = w1 / 2; // Dikdörtgenin merkezini bulmaya yardımcı olur
        h1 = h1 / 2; // Dikdörtgenin merkezini bulmaya yardımcı olur


        System.out.println(" Lütfen r2 dikdörtgeninin x ve y noktalarını giriniz ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        System.out.println(" Lütfen r2 dikdörtgeninin enini giriniz ");
        double w2 = scan.nextDouble();
        System.out.println(" Lütfen r2 dikdörtgeninin uzunluğunu giriniz :");
        double h2 = scan.nextDouble();
        w2 = w2 / 2;
        h2 = h2 / 2;

        double x1max = h1 + x1;  // Didkdörtgenin durumunu belirlemek için kullanılır.
        double y1max = h1 + y1;  // Didkdörtgenin durumunu belirlemek için kullanılır.
        double x1min = x1 - w1;  // Didkdörtgenin durumunu belirlemek için kullanılır.
        double y1min = y1 - h1;  // Didkdörtgenin durumunu belirlemek için kullanılır.
        double x2max = x2 + w2;  // Didkdörtgenin durumunu belirlemek için kullanılır.
        double y2max = y2 + h2;  // Didkdörtgenin durumunu belirlemek için kullanılır.
        double x2min = x2 - w2;  // Didkdörtgenin durumunu belirlemek için kullanılır.
        double y2min = y2 - h2;  // Didkdörtgenin durumunu belirlemek için kullanılır.

        if (x1max == y1max && x1min == y1min && x2max == y2max && x2min == y2min) {
            System.out.println(" Bu dikdörtgenler eş dikdörtgenlerdir ");

        } else if (x1max <= x2max && x1min >= x2min && y1max <= y2max && y1min >= y2min) {
            System.out.print("r1 dikdörtgeni r2 dikdörtgeninin içindedir ");
        }
        else if ((x1max < x2min) || (x1min > x2max) || (y1max < y2min) || (y2min > y1max))
        {
            System.out.println(" R2 dikdörtgeni R1 dikdörtgeni ile kesişmiyor ");
        }
        else {
            System.out.println(" R2 dikdörtgeni R1 dikdörtgeni ile kesişiyor ");
        }

    }

}





