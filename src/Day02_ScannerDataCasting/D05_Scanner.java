package Day02_ScannerDataCasting;

import java.util.Scanner;

public class D05_Scanner {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Dikdortgenin iki kenar uzunlugunu girin \nbirinci kenar girdikten sonra enter'a basin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdörtgenin Alani: " + kenar1*kenar2 );

    }
}
