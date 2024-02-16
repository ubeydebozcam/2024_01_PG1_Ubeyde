package chapter1;

public class S11 {
    public static void main(String[] args) {

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
        int yıldaNüfusArtısı = yıldaDoğum + yıldaGelenGöçmen - yıldaÖlüm;
        int birinciyılSonundaOlusanToplamNüfus = yıldaNüfusArtısı + suAnkiNufus;
        System.out.println(" 1 . Yılın Sonunda Oluşan Toplam Nüfus :" + birinciyılSonundaOlusanToplamNüfus);
        int ikinciYılSonundaOlusanToplamNüfus = birinciyılSonundaOlusanToplamNüfus + yıldaNüfusArtısı;
        System.out.println(" 2 . Yılın Sonunda Oluşan Toplam Nüfus :" + ikinciYılSonundaOlusanToplamNüfus);
        int ücüncüYılSonundaOlusanToplamNüfus = ikinciYılSonundaOlusanToplamNüfus + yıldaNüfusArtısı;
        System.out.println(" 3. Yılın Sonunda Oluşan Toplam Nüfus :" + ücüncüYılSonundaOlusanToplamNüfus);
        int dördüncüYılınSonundaOlusanToplamNüfus = ücüncüYılSonundaOlusanToplamNüfus + yıldaNüfusArtısı;
        System.out.println(" 4 . Yılın Sonunda Oluşan Toplam Nüfus :" + dördüncüYılınSonundaOlusanToplamNüfus);
        int besinciYılınSonundaOlusanToplamNüfus = dördüncüYılınSonundaOlusanToplamNüfus + yıldaNüfusArtısı;
        System.out.println(" 5. Yılın Sonunda Oluşan Toplam Nüfus :" + besinciYılınSonundaOlusanToplamNüfus);
    }
}
