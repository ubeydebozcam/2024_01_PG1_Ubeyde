package chapter2;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen ilk hızı (V0) giriniz :");
        double ilkHız = scan.nextDouble();
        System.out.print(" Lütfen son hızı (V1) giriniz :");
        double sonHız = scan.nextDouble();
        System.out.print(" Lütfen zamanı (sn) giriniz :");
        double zaman = scan.nextDouble();

        double ortalamaİvme = (sonHız - ilkHız) / zaman;

        System.out.print(" Ortalama İvme : " + ortalamaİvme);


    }
}
