package chapter3;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen üç basamaklı bir sayı giriniz :");
        int sayi = scan.nextInt();



        int basamak1 = (int) (sayi / 100); // Yüzler basamağı
        int kalan = sayi % 100;
        int basamak3 = (int) (kalan % 10); // Birler masağı


        if (basamak1 == basamak3)
        {
            System.out.println(" Girilen sayı palindrom bir sayıdır ");
        }
        else
        {
            System.out.println(" Girilen sayı palindrom bir sayı değildir ");
        }
    }
}
