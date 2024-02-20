package chapter3;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen a değerini giriniz :");
        double a = scan.nextDouble();
        System.out.print(" Lütfen b değerini giriniz :");
        double b = scan.nextDouble();
        System.out.print(" Lütfen c değerini giriniz :");
        double c = scan.nextDouble();

        double diskriminant = Math.pow(b , 2) - (4 * a * c);
        if (diskriminant > 0)
            {
            System.out.println(" Denklemin iki kökü vardır ");
            double kok1 = (-b + Math.pow(diskriminant, 0.5)) / (2 * a);
            double kok2 = (-b - Math.pow(diskriminant, 0.5)) / (2 * a);
            System.out.println(" Denlemin 1. kökü :" +kok1 + " Denklemin ikinci kökü :" +kok2);
            }
         else if (diskriminant ==0)
            {
            System.out.println(" Denklemin bir kökü vardır ");
            double kok1 = (-b - Math.pow(diskriminant, 0.5)) / (2 * a);
            System.out.println(" Denlemin kökü :" +kok1);
            }
        else
            System.out.println(" Denklemin kökü yoktur ");

    }
}
