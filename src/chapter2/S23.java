package chapter2;

import java.util.Scanner;

public class S23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen sürüş mesafesini giriniz :");
        double surusMesafesi = scan.nextDouble();
        System.out.print(" Lütfen aracın yakıt tüketimini giriniz :");
        double yakitTuketimi = scan.nextDouble();
        System.out.print(" Lütfen yakıt fiyatını giriniz :");
        double yakitFiyati = scan.nextDouble();

        double toplamSurusMaaliyeti = (surusMesafesi / yakitTuketimi) *  yakitFiyati;
        System.out.println(" Toplam sürüş maaliyeti :" +toplamSurusMaaliyeti);
    }
}
