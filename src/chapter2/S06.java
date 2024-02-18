package chapter2;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen 0 ile 1000 arasında bir sayı giriniz :");
        int sayi = scan.nextInt();

        int basamak1 = sayi % 10;
        System.out.println(basamak1);
        int basamak1Silme = sayi / 10;
        System.out.println(basamak1Silme);
        int basamak2 =  (basamak1Silme % 10);
        System.out.println(basamak2);
        int basamak2Silme =  (basamak1Silme / 10);
        System.out.println(basamak2Silme);

        int sonuc = (basamak1 + basamak2 + basamak2Silme);
        System.out.println(" Girilen sayının rakamları toplamı :" +sonuc );
    }
}
