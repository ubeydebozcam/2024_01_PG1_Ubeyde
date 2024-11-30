package chapter3;

import java.util.Scanner;

public class S13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("  Lütfen durumunuzu giriniz : 0-) Bekar , 1-) Evliliğin Ortak Başvurusu \n" +
                "veya Nitelikli Dul , 2-) Eşinden ayrılmış , 3-) Hane Reisi ");
        int durum = scan.nextInt();
        System.out.println(" Lütfen gelir miktarınızı giriniz : ");
        double gelirMiktari = scan.nextDouble();
        double vergi = 0;

        if (durum == 0) {
            if (gelirMiktari <= 8350) {
                vergi = gelirMiktari * 0.10;
            }
            else if (gelirMiktari <= 33950) {
                vergi = 8350 * 0.10 + (gelirMiktari - 8350) * 0.15;
            }
            else if (gelirMiktari <= 82250) {
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (gelirMiktari - 33950) * 0.25;
            }
            else if (gelirMiktari <= 171550) {
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (gelirMiktari - 82250) * 0.28;
            }
            else if (gelirMiktari <= 372950) {
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (gelirMiktari - 171550) * 0.33;
            }
            else {
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (gelirMiktari - 372950) * 0.35;
            }

        } else if (durum == 1) {
             if (gelirMiktari <= 16700){
                vergi = gelirMiktari * 0.10;
            }
            else if (gelirMiktari <= 67900) {
                vergi = 16700 * 0.10 + (gelirMiktari - 16700) * 0.15;
            }
            else if (gelirMiktari <= 137050) {
                vergi = 16700 * 0.10 + (67900 - 16700) * 0.15 + (gelirMiktari - 67900) * 0.25;
             }
            else if (gelirMiktari <= 208850) {
                 vergi = 16700 * 0.10 + (67900 - 16700) * 0.15 + (208850 - 67900) * 0.25 +
                         (gelirMiktari - 137050);
             }


        } else if (durum == 2) {

        } else if (durum == 3) {

        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        // Display the result
        System.out.println("Tax is " + (int) (vergi * 100) / 100.0);
    }
}