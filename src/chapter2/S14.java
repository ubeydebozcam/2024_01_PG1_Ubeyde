package chapter2;

import java.util.Scanner;

public class S14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen ağırlığınızı pound cinsinden giriniz :");
        double agırlık = scan.nextDouble();
        System.out.print(" Lütfen boyunuzu inch cinsinden giriniz :");
        double boyUzunlugu = scan.nextDouble();

        double sonuc1 = agırlık * 0.45359237; // Bizim girdiğimiz pound değerinin kg ye dönüşümü
        double sonuc2 = boyUzunlugu * 0.0254; // Bizim girdiğimiz inch değerinin metreye dönüşümü
        double vucutKitleEndeksi = sonuc1 / (sonuc2 * sonuc2);

        System.out.println(" Vücut Kitle Endeksi :" +vucutKitleEndeksi);

    }
}
