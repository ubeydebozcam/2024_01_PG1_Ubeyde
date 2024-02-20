package chapter3;

import java.util.Scanner;

public class S08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int enBuyuk, enKucuk, ortanca;
        System.out.print(" Lütfen birinici sayısı giriniz :");
        int sayi1 = scan.nextInt();
        System.out.print(" Lütfen ikinci sayıyı giriniz :");
        int sayi2 = scan.nextInt();
        System.out.print(" Lütfen üçüncü sayıyı giriniz :");
        int sayi3 = scan.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println(" En büyük sayı : " + sayi1);
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println(" En büyük sayı :" + sayi2);
        } else {
            System.out.println(" En büyük sayı :" + sayi3);
        }

        if (sayi1 < sayi2 || sayi2 > sayi3)
        {
            System.out.println(" Ortanca sayı :" + sayi1);
        } else if (sayi2 < sayi1 || sayi1 > sayi3)
            {
                System.out.println(" Ortanca sayı :" + sayi2);
        }
        else
        {
            System.out.println(" Ortanca sayı : " + sayi3);
        }
        if (sayi1 < sayi2 || sayi1 < sayi3)
        {
            System.out.println(" En küçük sayı :" + sayi1 );
        } else if (sayi2 < sayi1 && sayi2 < sayi3)
            {
                System.out.println(" En küçük sayı :" +sayi2);
        }
        else
        {
            System.out.println(" En küçük sayı :" +sayi3);
        }

    }
}
