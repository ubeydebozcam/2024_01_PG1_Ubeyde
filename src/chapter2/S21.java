package chapter2;

import java.util.Scanner;

public class S21 {
    public static void main(String[] args) {
        // Sonuç yanlış çıkıyo
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen yatırım miktarını giriniz :");
        double yatirimMiktari = scan.nextDouble();
        System.out.print(" Lütfen yıllık faiz oranını yüzde olarak giriniz :");
        double yillikFaizOrani = scan.nextDouble();
        System.out.print(" Lütfen yıl sayısını giriniz :");
        double yilSayisi = scan.nextDouble();
        double aylikFaizOrani = yillikFaizOrani / 12 / 100;


        double yatiriminGeriDonusDegeri = yatirimMiktari * (1 + aylikFaizOrani);
        System.out.println(yatiriminGeriDonusDegeri);


        System.out.println(" Yatırımın Geri Dönüş Değeri : " +yatiriminGeriDonusDegeri);
    }
}
