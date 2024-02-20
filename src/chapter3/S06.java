package chapter3;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen ağırlığınızı pound cinsinden giriniz :");
        double agırlık = scan.nextDouble();
        System.out.print(" Lütfen boyunuzu inch cinsinden giriniz :");
        double inches = scan.nextDouble();
        System.out.print(" Lütfen feet değerini giriniz :");
        double feet = scan.nextDouble();


        final double kilogramBasınaPound = 0.45359237;
        final double inchBasınaMetre = 0.0254;
        final double inchBasınaUzunluk = 0.0833333;

        agırlık *= kilogramBasınaPound;
        double height = (inches += feet / inchBasınaUzunluk) * inchBasınaMetre;
        double vucutKitleEndeksi = agırlık / (Math.pow(height, 2));

        System.out.println(" Vücut Kitle Endeksi :" + vucutKitleEndeksi);
        if (vucutKitleEndeksi < 18.5) {
            System.out.println(" Düşük Kilolu ");
        } else if (vucutKitleEndeksi < 25) {
            System.out.println(" Normal Kilolu ");
        } else if (vucutKitleEndeksi < 30) {
            System.out.println(" Aşırı Kilolu ");
        } else {
            System.out.println(" Obez ");
        }
    }
}
