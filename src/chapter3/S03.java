package chapter3;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen a değerini giriniz :");
        double a = scan.nextDouble();
        System.out.print(" Lütfen b değerini giriniz :");
        double b = scan.nextDouble();
        System.out.print(" Lütfen c değerini giriniz :");
        double c = scan.nextDouble();
        System.out.print(" Lütfen d değerini giriniz :");
        double d = scan.nextDouble();
        System.out.print(" Lütfen e değerini giriniz :");
        double e = scan.nextDouble();
        System.out.print(" Lütfen f değerini giriniz :");
        double f = scan.nextDouble();

        double islem1 = (e * d - b * f);
        double islem2 = (a * d - b * c);
        double islem3 = (a * f - e * c);

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        if (islem2 == 0)
        {
            System.out.print(" Denklemin çözümü yoktur");
        }
        else
        {
            System.out.println(" x in değeri : " + x);
            System.out.println(" y nin değeri : " +y);
        }
    }
}
