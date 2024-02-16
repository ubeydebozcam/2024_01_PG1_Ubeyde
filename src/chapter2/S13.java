package chapter2;

import java.util.Scanner;

public class S13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen aylık biriktirdiği para miktarını giriniz :");
        double aylıkPara = scan.nextDouble();
        double aylıkFaizOranı = 0.05 / 12;

        /*
        System.out.println(" ilk ay sonunda oluşan toplam para :" + 100 * (1 + 0.00417));
        System.out.println(" İkinci ay sonunda oluşan toplam para :" + (100 + 100.417) * (1 + 0.00417));
        System.out.println(" Üçüncü ay sonunda oluşan toplam para :" + (100 + 201.252) * (1 + 0.00417));
        System.out.println(" Dördüncü ay sonunda oluşan toplam para :" + (100 + 302.507) * (1 + 0.00417));
        System.out.println(" Beşinci ay sonunda oluşan toplam para :" + (100 + 404.185) * (1 + 0.00417));
        */
        System.out.println(" Altıncı ay sonunda oluşan toplam para :" + (100 + 506.287) * (1 + 0.00417));
    }
}
