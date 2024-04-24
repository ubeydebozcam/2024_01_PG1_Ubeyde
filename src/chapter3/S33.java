package chapter3;

import java.util.Scanner;

public class S33 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Paket 1' in ağırlığını ve   fiyatını  giriniz :");
        double agırlık1 = scan.nextDouble();
        double fiyat1 = scan.nextDouble();
        System.out.println(" Paket 2' nin ağırlığını ve  fiyatını  giriniz :");
        double agırlık2 = scan.nextDouble();
        double fiyat2 = scan.nextDouble();

        double kgFiyat1 = fiyat1 / agırlık1;
        double kgFiyat2 = fiyat2 / agırlık2;

        if (kgFiyat1 > kgFiyat2){
            System.out.println(" Paket 1 daha pahalıdır yani Paket 2 daha uygundur ");
        } else if (kgFiyat1 == kgFiyat2) {
            System.out.println(" İki paketin fiyatı da aynıdır");
        }
        else if (kgFiyat2 > kgFiyat1) {
            System.out.println(" Paket 2 daha pahalıdır yani Paket 1 daha uygundur  ");
        }
    }
}
