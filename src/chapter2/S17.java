package chapter2;

import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen -58F ile 41F arasında bir sıcaklık değeri giriniz : ");
        double sıcaklık = scan.nextDouble();
        System.out.print(" Lütfen rüzgar hız değerini saatte en az 2 mil olacak şekilde giriniz :");
        double ruzgarHızı = scan.nextDouble();

        double hissedilenSıcaklık = 35.74 + (0.6215 * sıcaklık) - 35.75 * Math.pow(ruzgarHızı, 0.16)
                + (0.4275 * sıcaklık * Math.pow(ruzgarHızı, 0.16));

        System.out.println(" Hissedilen Sıcaklık :" +hissedilenSıcaklık);


    }
}
