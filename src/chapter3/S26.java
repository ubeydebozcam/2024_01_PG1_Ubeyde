package chapter3;

import java.util.Scanner;

public class S26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen sayi giriniz :");
        int sayi = scan.nextInt();

        System.out.println(sayi + " 5 ve 6' ya tam bölünebilir  doğru mu  ? " +
                ((sayi % 5 == 0) && (sayi % 6 == 0)));

        System.out.println(sayi + " 5 ya da  6' ya tam bölünebilir doğru mu ? " +
                ((sayi % 5 == 0) || (sayi % 6 == 0)));

        System.out.println(sayi + " 5 ya da 6' ya bölünebilir  ama her ikisine de bölünemez doğru mu  ? " +
                ((sayi % 5 == 0) && (sayi % 6 == 0)));
    }
}
