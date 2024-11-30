package chapter3;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        // Sadece son satirda yazi yerine sayi yaziyor
        Scanner scan = new Scanner(System.in);
        System.out.print(" Kacinci gün oldugunu giriniz :");
        int gun = scan.nextInt();


        switch (gun) {
            case 0:
                System.out.println(" Pazardir ");
                break;
            case 1:
                System.out.println(" Pazartesidir ");
                break;
            case 2:
                System.out.println(" Salidir ");
                break;
            case 3:
                System.out.println(" Carsambadir ");
                break;
            case 4:
                System.out.println(" Persembedir ");
                break;
            case 5:
                System.out.println(" Cumadir ");
                break;
            case 6:
                System.out.println(" Cumartesidir ");
                break;
        }

        System.out.print(" Bugunden kac gun sonrasını bulmak istediginizi giriniz :");
        int secim = scan.nextInt();

        int sonuc1 = secim + gun;
        int sonuc2 = sonuc1 % 7;
        // System.out.println(sonuc); // sonuc degerini int olarak döndürür.

        switch (sonuc2){
            case 0:
                System.out.println(" Pazardir ");
                break;

            case 1:
                System.out.println(" Pazartesidir ");
                break;

            case 2:
                System.out.println(" Salidir ");
                break;

            case 3:
                System.out.println(" Carsambadir  ");
                break;

            case 4:
                System.out.println(" Persembedir  ");
                break;

            case 5:
                System.out.println(" Cumadir  ");
                break;

            case 6:
                System.out.println(" Pazardir ");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sonuc2);
        }


        System.out.println(" Bugun gunlerden " + gun + " ve gelecekteki gun de " + sonuc2);

    }
}
