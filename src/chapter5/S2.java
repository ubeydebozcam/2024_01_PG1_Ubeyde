package chapter5;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        final int soruSayisi = 10; // Soru sayısı
        int dogruCevap = 0; // Doğru cevap sayısı
        int count = 0; // Soru sayacı
        long baslamaZamani = System.currentTimeMillis(); // calısma zamani icin
        String output = ""; // Başlangıçta boş bir string
        Scanner scan = new Scanner(System.in);

        while (count < soruSayisi) {
            int sayi1 = (int) (Math.random() * 10) + 1;
            int sayi2 = (int) (Math.random() * 10) + 5;

            if (sayi1 < sayi2) {
                int temp = sayi1;
                sayi1 = sayi2;
                sayi2 = temp;
            }

            // Kullanıcıya "number1 + number2?" sorusunu sorma
            System.out.print(sayi1 + "+" + sayi2 + " = ? ");
            int cevap = scan.nextInt();

            if (sayi1 + sayi2 == cevap) {
                System.out.println("Cevabınız doğrudur ");
                dogruCevap++; // Doğru cevap sayısını artır
            } else {
                System.out.println("Cevabınız yanlıştır .\n" + sayi1 + "+" + sayi2
                          + " = " + (sayi1 + sayi2) + " olmalıydı ");
            }

            count++;

            // Cevap doğru mu yanlış mı olduğunu kaydet
            output += "\n" + sayi1 + "-" + sayi2 + "=" + cevap +
                    ((sayi1 - sayi2 == cevap) ? " dogğru" : " yanlış");
        }

        long bitisZamani = System.currentTimeMillis();
        long testZamani = bitisZamani - baslamaZamani;

        System.out.println("Doğru ceavp sayısı " + dogruCevap);
        System.out.println("Test " + testZamani / 1000 + " saniye \n" + output);
    }
}
