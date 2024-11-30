package chapter4;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen beşgenin merkezinden köşesine kadar olan uzunluğu  giriniz :");
        double uzunluk = scan.nextDouble();

        double s = (2 * uzunluk) * Math.sin(Math.PI  / 5);
        double alan = (5 * Math.pow(s , 2)) / (4 * Math.tan(Math.PI / 5));


        double yuvarlanmisDeger = Math.round(alan * 100.0) / 100.0;
        System.out.println("Alan: " + yuvarlanmisDeger);
    }
}
