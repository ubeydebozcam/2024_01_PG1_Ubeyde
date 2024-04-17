package chapter3;

import java.util.Scanner;

public class S20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen -58 Fahrenhayt ve 41 Fahrenhayt arasında bir sıcaklık giriniz :");
        double sicaklik = scan.nextDouble();
        System.out.print(" Lütfen rüzgar hız değerini saatte en az 2 mil olacak şekilde giriniz :");
        double ruzgarHizi = scan.nextDouble();


        double hissedilenSicaklik = 35.74 + (0.6215 * sicaklik) - 35.75 * Math.pow(ruzgarHizi, 0.16)
                + (0.4275 * sicaklik * Math.pow(ruzgarHizi, 0.16));

        if (sicaklik > -58 && sicaklik < 41 && ruzgarHizi >= 2){
            System.out.println(" Geçerli Değerler Girdiniz Tebrikler ");
            System.out.println(" Hissedilen Sıcaklık  : " + hissedilenSicaklik);
        }
        else {
            System.out.println(" Geçersiz Değerler Girdiniz ");
            System.out.println(sicaklik);
        }
    }
}
