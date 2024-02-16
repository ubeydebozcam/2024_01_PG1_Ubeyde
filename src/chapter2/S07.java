package chapter2;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        // Yardım alarak yaptım
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen dakikayı giriniz :");
        long dakika = scan.nextLong();

        long dakikaBirYıl = 365 * 24 * 60;
        long yıl = dakika / dakikaBirYıl;
        long kalanDakika = dakika % dakikaBirYıl;
        long gün = kalanDakika / (24 * 60);
        kalanDakika %= (24 * 60);

        System.out.println(dakika + " Dakika ortalama " + yıl + " Yıl " + gün + " Gün " +kalanDakika + " Dakikadır ");


    }
}
