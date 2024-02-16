package chapter1;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double saatCinsindenSaniye;
        double ortalamaHız;
        double milMesafe = 0;
        double mesafe;
        int saniye;
        System.out.print(" Mesafeyi giriniz (km):");
        mesafe = scan.nextDouble();
        System.out.print(" Zamanı giriniz (sn):");
        saniye = scan.nextInt();

        milMesafe = mesafe / 1.6;
        saatCinsindenSaniye = saniye / 3600.0;
        ortalamaHız = milMesafe / saatCinsindenSaniye;

        System.out.println(" Ortalama Hız :" +ortalamaHız);


    }
}
