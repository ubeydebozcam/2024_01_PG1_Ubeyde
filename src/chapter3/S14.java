package chapter3;

import java.util.Scanner;

public class S14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int para = (int) (Math.random() * 2 );

        System.out.print(" Lütfen 0 ile 1  arasında bir tahminde bulununuz : ");
        int tahmin = scan.nextInt();

        if (para == tahmin)
        {
            System.out.println(" Tahmininiz doğrudur ");
        }
        else
        {
            System.out.println(" Tahmininiz yanlıştır ");
        }
    }
}
