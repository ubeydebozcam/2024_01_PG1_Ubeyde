package chapter2;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suAnkiNufus = 312032486;
        int dakikadaDoğum = 8;
        int dakikadaÖlüm = 4;
        int dakikadaGelenGöçmen = 1;
        System.out.println(" Dakikada Nüfus Artışı : " + (dakikadaDoğum + dakikadaGelenGöçmen
                - dakikadaÖlüm) + " Kişidir");
        int saatteDoğum = dakikadaDoğum * 60;
        int saatteÖlüm = dakikadaÖlüm * 60;
        int saatteGelenGöcmen = dakikadaGelenGöçmen * 60;
        System.out.println(" Saatte Nüfus Artışı : " + (saatteDoğum + saatteGelenGöcmen - saatteÖlüm) + " Kişidir");
        int gündeDoğum = saatteDoğum * 24;
        int gündeÖlüm = saatteÖlüm * 24;
        int gündeGelenGöçmen = saatteGelenGöcmen * 24;
        System.out.println(" Günde Nüfus Artışı : " + (gündeDoğum + gündeGelenGöçmen - gündeÖlüm) + " Kişidir");
        int yıldaDoğum = gündeDoğum * 365;
        int yıldaÖlüm = gündeÖlüm * 365;
        int yıldaGelenGöçmen = gündeGelenGöçmen * 365;
        System.out.println(" 1 Yılda Nüfus Artışı : " + (yıldaDoğum + yıldaGelenGöçmen - yıldaÖlüm) + " Kişidir");
        System.out.print(" Lütfen yıl sayısını giriniz :");
        int yilSayisi = scan.nextInt();

        int yillikArtis = 365 * 24 * 60 * 60 / 7 - 365 * 24 * 60 * 60 / 13 + 365 * 24 * 60 * 60 / 45;
        int nufus = suAnkiNufus + yilSayisi * yillikArtis;

        System.out.println(yilSayisi + " yıl sonra tahmini nüfus: " + nufus);

    }
}
