package chapter7;
import java.util.Scanner;

public class S02 {
    public static void fill(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();
    }
    public static void main(String[] args) {
        int[] dizi = new int[10];
        System.out.print("Lütfen 10 tane sayı giriniz : ");
        fill(dizi); // dizinin tüm elemanlarını belirtilen değerle doldurur.

        for (int i = dizi.length - 1; i >= 0; i--)
            System.out.print(dizi[i] + " ");
        System.out.println();
    }

}
