package chapter2;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" Lütfen Santigrat Değerini Giriniz :");
        double santigrat = scan.nextDouble();

        double fahrenhayt = (9.0 / 5) * santigrat + 32;
        System.out.println(santigrat + " Santigrat " +fahrenhayt + " Fahrenhayttır ");
    }
}
