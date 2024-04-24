package chapter3;

import java.util.Scanner;

public class S32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" P0 , P1 , P2 için x ve y noktasını giriniz :");
        double x0 = scan.nextDouble();
        double y0 = scan.nextDouble();
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double konum = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        System.out.print("(" + x2 + ", " + y2 + ") ");
        if (konum > 0) {

            System.out.println(" Gelen satır (" + x0 + ", " + y0 + ") ile (" + x1 + ", " + y1 + ") arasında olan doğrunun " +
                    "sol tarafında bulunur ");
        } else if (konum == 0) {

            System.out.println(" Gelen satır (" + x0 + ", " + y0 + ") ile (" + x1 + ", " + y1 + ") arasında olan doğrunun " +
                    "üzerinde  bulunur ");
        } else if (konum < 0) {

            System.out.println(" Gelen satır (" + x0 + ", " + y0 + ") ile (" + x1 + ", " + y1 + ") arasında olan doğrunun " +
                    "sağ tarafında bulunur ");
        }

    }
}
