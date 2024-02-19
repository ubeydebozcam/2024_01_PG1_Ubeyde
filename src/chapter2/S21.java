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
        double aylikFaizOrani = yillikFaizOrani / 1200;


        double yatiriminGeriDonusDegeri = yatirimMiktari * Math.pow(1 + aylikFaizOrani , yilSayisi * 12);
        System.out.println(yatiriminGeriDonusDegeri);


        System.out.println(" Yatırımın Geri Dönüş Değeri : " +yatiriminGeriDonusDegeri);
    }
}
