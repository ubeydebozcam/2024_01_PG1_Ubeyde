package chapter2;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen suyun miktarını kilogram cinsinden (M) giriniz :");
        double kilogram = scan.nextDouble();
        System.out.print(" Lütfen başlangıç sıcaklığını giriniz :");
        double ilkSıcaklık = scan.nextDouble();
        System.out.print(" Lütfen son sıcaklığı giriniz :");
        double sonSıcaklık = scan.nextDouble();

        double enerji = kilogram * (sonSıcaklık - ilkSıcaklık) * 4184;

        System.out.print(" Gereken Enerji :" + enerji);
    }
}
