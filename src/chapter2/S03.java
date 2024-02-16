package chapter2;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen feet değerini giriniz :");
        double feet = scan.nextDouble();
        double birFeet = 0.305;

        double metre = feet * birFeet;
        System.out.println(feet + " Feet " + metre + " metredir");
    }
}
