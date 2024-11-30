package chapter5;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       int pozitif = 0;
       int negatif = 0;
       int toplam = 0;
       int ortalama;
       int count = 0;

        System.out.println(" Lütfen sayı giriniz.Ama 0 girildiğinde program biter : ");
        int giris = scan.nextInt();
        if(giris == 0){
            System.out.println(" Program bitmiştir");
            System.exit(1);
        }

        while(giris != 0){

            if (giris > 0)
                pozitif++;
            else
                negatif++;

            toplam += giris;
            count++;

            giris = scan.nextInt();
        }

       ortalama = toplam / count;

        System.out.println(" Girilen pozitif sayının adedi :" + pozitif);
        System.out.println(" Girilen negatif sayının adedi :" + negatif);
        System.out.println(" Girilen sayıların toplamı :" + toplam);
        System.out.println(" Girilen sayıların ortalaması :" + ortalama);

    }
}
