package chapter3;

import java.util.Scanner;

public class S31 {
    public static void main(String[] args) {

        // Dolardan Rmb' ye döviz kuru 7.25' tir. Hesaplamalar bu kurdan hesaplanmıştır.
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lütfen seçiminizi yapınız \n 1) Dolar >= Rmb \n 0) Rmb >= Dolar ");
        int secim = scan.nextInt();

        if (secim == 1){
            System.out.print(" Lütfen dolar miktarını giriniz :");
            double mıktar = scan.nextDouble();
            double donusum1 = mıktar * 7.25;
            System.out.println(" Girilen Miktar : "  + donusum1 + " Yuandır ");
        } else if (secim ==0) {
            System.out.print(" Lütfen Yuan miktarını giriniz :");
            double miktar = scan.nextDouble();
            double donusum2 = miktar / 7.25;
            System.out.println(" Girilen Miktar : "  + donusum2 + " Dolardır ");
        }
        else {
            System.out.println(" Yanlış Giriş Yaptınız ");
        }

    }
}
