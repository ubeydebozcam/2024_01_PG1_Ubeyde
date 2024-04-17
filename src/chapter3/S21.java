package chapter3;

import java.util.Scanner;

public class S21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Lütfen yılı giriniz :");
        int yil = scan.nextInt();
        System.out.print(" Lütfen ayı giriniz (1 - 12 arası) :");
        int ay = scan.nextInt();
        System.out.print(" Lütfen ayın kaçı olduğunu giriniz :");
        int ayinKaci = scan.nextInt();
        int k = (yil % 100);
        int j = (yil / 100);

        if (ay == 1 || ay == 2) {
            ay = (ay == 1) ? 13 : 14;
            yil--;
        }

        int haftaninHangiGünü = (ayinKaci + (26 * (ay + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;


        System.out.print(" Haftanın günü : ");
        switch (haftaninHangiGünü) {
            case 0:
                System.out.println(" Pazar ");
                break;
            case 1:
                System.out.println(" Pazartesi ");
                break;
            case 2:
                System.out.println(" Salı ");
                break;
            case 3:
                System.out.println(" Çarşamba ");
                break;
            case 4:
                System.out.println(" Perşembe ");
                break;
            case 5:
                System.out.println(" Cuma ");
                break;
            case 6:
                System.out.println(" Cumartesi ");
                break;
        }

    }
}
