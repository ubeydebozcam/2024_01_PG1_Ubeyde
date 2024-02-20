package chapter3;

import java.util.Scanner;

public class S07 {
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

        if (dolarSayısı > 1)
        {
            System.out.println(dolarSayısı + " Dolarlar");
        }
        else
        {
            System.out.println(dolarSayısı + " Dolar");
        }
        if (yarım > 1)
        {
            System.out.println(yarım + " Yarımlar ");
        }
        else
        {
            System.out.println(yarım + " Yarım ");
        }
        if (ceyrekler > 1 )
        {
            System.out.println(ceyrekler + " Çeyrekler ");
        }
        else
        {
            System.out.println(ceyrekler + " Çeyrek ");
        }
        if (onKurusluklar > 1)
        {
            System.out.println(onKurusluklar + " On kuruşlar");
        }
        else
        {
            System.out.println(onKurusluklar + " On kuruş ");
        }
        if (besKurusluklar > 1)
        {
            System.out.println(besKurusluklar + " Beş kuruşlar ");
        }
        else
        {
            System.out.println(besKurusluklar + " Beş kuruş ");
        }
        if (birKuruslar > 1)
        {
            System.out.println(birKuruslar + " Bir Kuruşlar ");
        }
        else
        {
            System.out.println(birKuruslar + " Bir kuruş ");
        }
    }
}
