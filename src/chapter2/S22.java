package chapter2;

import java.util.Scanner;

public class S22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen para miktarını giriniz :");
        int miktar = scan.nextInt();
        int kalanMiktar = miktar;

        int dolarSayısı = kalanMiktar / 100;
        kalanMiktar %= 100;
        int yarım = kalanMiktar / 50;
        kalanMiktar %= 50;
        int ceyrekler = kalanMiktar / 25;
        kalanMiktar %= 25;
         int onKurusluklar = kalanMiktar / 10;
         kalanMiktar %= 10;
         int besKurusluklar = kalanMiktar / 5;
         kalanMiktar %= 5;
         int birKuruslar = kalanMiktar;

        System.out.println(" Para miktarı " + miktar / 100.0 + " dolardır :");
        System.out.println("              " + dolarSayısı + " Tane dolar ");
        System.out.println("              " + yarım + " Tane elli kuruş ");
        System.out.println("              " + ceyrekler + " Tane çeyrek ");
        System.out.println("              " + onKurusluklar + " Tane on kuruş ");
        System.out.println("              " + besKurusluklar + " Tane beş kuruş ");
        System.out.println("              " + birKuruslar + " Tane bir kuruş ");

    }
}
