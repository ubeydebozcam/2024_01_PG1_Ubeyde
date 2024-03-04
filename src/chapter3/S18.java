package chapter3;

import java.util.Scanner;

public class S18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen paletin ağırlığını giriniz :");
        double paketAgırlıgı = scan.nextDouble();
        double maliyet = 0;

        if (paketAgırlıgı <= 0) {
            System.out.println(" Geçersiz ağırlık girdiniz ");
        } else if (paketAgırlıgı == 50) {
            System.out.println(" Paket gönderilemez");
        } else if (paketAgırlıgı > 0 && paketAgırlıgı <= 1) {
            maliyet = 3.5;
        } else if (paketAgırlıgı > 1 && paketAgırlıgı <= 3) {
            maliyet = 5.5;
        } else if (paketAgırlıgı > 3 && paketAgırlıgı <= 10) {
            maliyet = 8.5;
        } else if (paketAgırlıgı > 10 && paketAgırlıgı <= 20) {
            maliyet = 10.5;
        }

        System.out.println(" Kargo maliyeti : " + maliyet);

    }
}
