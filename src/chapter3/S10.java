package chapter3;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1 = (int) (Math.random() * 100);
        int sayi2 = (int) (Math.random() * 100);

        if (sayi1 < sayi2) {
            int temp = sayi1;

            sayi1 = sayi2;
            sayi2 = temp;
        }

        System.out.print (  sayi1 + " + " + sayi2 + " ? : ");
        Scanner scanner = new Scanner(System.in);
        int answer = scan.nextInt();

        if (sayi1 + sayi2 == answer)
            System.out.println(" Cevabınız doğrudur ");
        else {
            System.out.println(" Cevabınız yanlıştır ");
            System.out.println(sayi1 + " + " + sayi2 +
                    " =  " + (sayi1 + sayi2));
        }
    }
}