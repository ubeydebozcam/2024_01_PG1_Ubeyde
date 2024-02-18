package chapter2;

import java.util.Scanner;

public class S20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen bakiyeyi giriniz :");
        double bakiye = scan.nextDouble();
        System.out.print(" Lütfen yıllık faiz oranını giriniz :");
        double yillikFaizOrani = scan.nextDouble();

        double faizGetirisi = bakiye * (yillikFaizOrani / 1200);

        System.out.println(" Faiz getirisi :" +faizGetirisi);
    }
}
