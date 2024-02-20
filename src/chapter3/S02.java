package chapter3;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        int sayi1 = (int)(System.currentTimeMillis() % 10);
        int sayi2 = (int)(System.currentTimeMillis() / 7 % 10);
        int sayi3 = (int)(System.currentTimeMillis() / 5 % 10);

        Scanner scan = new Scanner(System.in);
        System.out.print(sayi1 + " + " + sayi2 + " + " + sayi3 + " Toplamı nedir ? :");

        int sonuc = scan.nextInt();
        System.out.println(sayi1 + " + " + sayi2 + " + " +  sayi3 + " = " + sonuc + " sonuç " + (sayi1 + sayi2 + sayi3 == sonuc));

    }
}
