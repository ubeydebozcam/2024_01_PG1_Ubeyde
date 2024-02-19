package chapter2;

import java.util.Scanner;

public class S08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.print(" GMT’ye göre bulunulan zaman dilimini giriniz :");
        int gmt = scan.nextInt();

        System.out.println("Current time is " + (currentHour + gmt) +   ":"
                + currentMinute + ":" + currentSecond + " GMT");


    }
}
