package chapter3;

import java.util.Scanner;

public class S34 {
    public static void main(String[] args) {

        // else if bloğunda hata var
        Scanner scan = new Scanner(System.in);
        System.out.println(" P0 , P1 , P2 için x ve y noktasını giriniz :");
        double x0 = scan.nextDouble();
        double y0 = scan.nextDouble();
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double l = 1;

        double xd = x1 + (x2 - x1 / l) * d;
        double yd = y1 + (y2 - y1 / l) * d;

        if (xd == yd) {
            System.out.println("Gelen satır (" + x0 + ", " + y0 + ")  (" + x2 + ", " + y2 + ")" +
                    " ile  (" + x0 + ", " + y0 + ")    arasında olan doğru parçasındadır ");
        } else if (yd > xd) {
            System.out.println("Gelen satır (" + x0 + ", " + y0 + ")  (" + x2 + ", " + y2 + ")" +
                  " ile  (" + x0 + ", " + y0 + ")    arasında olan doğru parçasında değildir");

        }
    }
}