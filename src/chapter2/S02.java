package chapter2;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen silindirin yüksekliğini giriniz :");
        double yukseklık = scan.nextDouble();
        System.out.print(" Lütfen silindirin yarıçapını giriniz :");
        double yarıCap = scan.nextDouble();

        double alan = yarıCap * yarıCap * Math.PI;
        System.out.println(" Silindirin alanı :" + alan);
        double hacim = alan * yukseklık;
        System.out.println(" Silindirin hacmi :" +hacim);
    }
}
