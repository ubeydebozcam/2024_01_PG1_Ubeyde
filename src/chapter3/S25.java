package chapter3;

import java.util.Scanner;

public class S25 {
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
        System.out.print(" Lütfen x4 noktasını giriniz :");
        double x4 = scan.nextDouble();
        System.out.print(" Lütfen y4 noktasını giriniz :");
        double y4 = scan.nextDouble();

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);


        if (a * d - b * c == 0) {
            System.out.println(" İki doğru birbirine paraleldir ");
        } else {
            System.out.println("  İki doğrunun kesiştiği X noktası : " + x);
            System.out.println("  İki doğrunun kesiştiği Y noktası : " + y);
        }

    }
}
