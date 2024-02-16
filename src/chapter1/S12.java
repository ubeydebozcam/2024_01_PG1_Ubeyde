package chapter1;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double saatCinsindenSaniye;
        double ortalamaHız;
        double milMesafe = 0;
        double mesafe;
        int saniye;
        System.out.print(" Mesafeyi giriniz (mil):");
        mesafe = scan.nextDouble();
        System.out.print(" Zamanı giriniz (sa):");
        saniye = scan.nextInt();

        milMesafe = mesafe * 1.6;
        saatCinsindenSaniye = saniye / 3600.0;
        ortalamaHız = milMesafe / saatCinsindenSaniye;

        System.out.println(" Ortalama Hız :" +ortalamaHız);
    }
}
