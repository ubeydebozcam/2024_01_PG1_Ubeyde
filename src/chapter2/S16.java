package chapter2;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen kenar uzunluğunu (s) giriniz :");
        double kenarUzunlugu = scan.nextDouble();

        System.out.println(3* Math.sqrt(3));
        double alan =  (3 * Math.sqrt(3) / 2) * (Math.pow(kenarUzunlugu , 2));
        System.out.println(" Altıgenin Alanı :" +alan);
    }
}
