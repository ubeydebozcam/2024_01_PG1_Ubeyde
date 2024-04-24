package chapter3;

import java.util.Scanner;

public class S30 {
    public static void main(String[] args) {

        //  Hata var !!
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

        //  currentHour += gmt;  // Chatgpt ' den baktım
        // if (currentHour < 0) {
        //    currentHour += 24;
        // } else if (currentHour >= 24) {
        //    currentHour -= 24;
        // }

        System.out.println("Current time is " + (currentHour + gmt) + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
