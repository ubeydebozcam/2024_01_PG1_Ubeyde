package chapter2;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen ara toplamı giriniz :");
        double araToplam = scan.nextDouble();
        System.out.print(" Lütfen komisyon oranını giriniz :");
        double komisyonOrani = scan.nextDouble();

        double komisyonMıktarı = araToplam * komisyonOrani / 100;
        System.out.println( " Komisyon Miktarı :" + komisyonMıktarı);
        double toplam = araToplam + komisyonMıktarı;
        System.out.println(" Toplam :" +toplam);
    }
}
