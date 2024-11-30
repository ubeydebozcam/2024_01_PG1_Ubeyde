package chapter3;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen ay sayısını giriniz :");
        int aySayisi = scan.nextInt();
        if (aySayisi > 12){
            System.out.println(" Ay sayisi 12'den büyük olamaz. Tekrar deneyiniz  ");
            return;
        }

        System.out.print(" Lütfen yıl sayısını giriniz :");
        int yilSayisi = scan.nextInt();
        boolean artikYil = (yilSayisi % 4 == 0 && yilSayisi % 100 != 0) || (yilSayisi % 400 == 0);

        switch (aySayisi){
            case 1:
                System.out.println(" Ocak " + yilSayisi + "," + "31 gündür"); break;
            case 2:
                System.out.println(" Şubat " + yilSayisi + "," + ((artikYil) ? "29 gündür " : " 28gündür ")); break;
            case 3:
                System.out.println(" Mart " + yilSayisi + "," + " 31 gündür "); break;
            case 4:
                System.out.println(" Nisan " + yilSayisi + "," + " 30 gündür "); break;
            case 5:
                System.out.println(" Mayıs " + yilSayisi + "," + " 31 gündür "); break;
            case 6:
                System.out.println(" Haziran  " + yilSayisi + "," + " 30 gündür "); break;
            case 7:
                System.out.println(" Temmuz  " + yilSayisi + "," + " 31 gündür "); break;
            case 8:
                System.out.println(" Ağustos " + yilSayisi + "," + " 31 gündür "); break;
            case 9:
                System.out.println(" Eyllu " + yilSayisi + "," + " 30 gündür "); break;
            case 10:
                System.out.println(" Ekim " + yilSayisi + "," + " 31 gündür "); break;
            case 11:
                System.out.println(" Kasim  " + yilSayisi + "," + " 30 gündür "); break;
            case 12:
                System.out.println(" Aralik " + yilSayisi + "," + " 31 gündür "); break;
            default:
                System.out.println(" Yanlis tuslama yaptiniz ");
                return;
        }








    }
}
