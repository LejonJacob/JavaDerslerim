package Day02_ScannerDataCasting;

import java.util.Scanner;

public class D03_Scanner {

    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int tamsayi= scan.nextInt();

        System.out.println("lütfen ondalikli bir sayi giriniz");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("Girilen sayilarin carpimi :" + tamsayi*ondalikliSayi);
        System.out.println("Girilen sayilarin toplami :" + (tamsayi+ondalikliSayi));

    }
}
