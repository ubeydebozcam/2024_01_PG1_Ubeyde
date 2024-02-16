package chapter2;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen hızı (V) giriniz :");
        double hız = scan.nextDouble();
        System.out.print(" Lütfen ivmeyi giriniz :");
        double ivme = scan.nextDouble();

        double pistMesafesi = (hız * hız) / (2 * ivme);

        System.out.print(" Bu uçak için gereken pist mesafesi :" +pistMesafesi);
    }
}
