package chapter2;

import java.util.Scanner;

public class S15 {
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

        double ikiNoktaArasındakiUzaklık = Math.sqrt(Math.pow (x2 - x1, 2) +  Math.pow(y2 - y1 , 2));

        System.out.println(" İki nokta arasındaki uzaklık :" +ikiNoktaArasındakiUzaklık);

    }
}
