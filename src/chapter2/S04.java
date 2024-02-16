package chapter2;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen pound cinsinden bir değer giriniz :");
        double pound = scan.nextDouble();

        double sonuc = pound * 0.454;
        System.out.println(pound + " Pound " + sonuc + " Kilogramdır ");

    }
}
