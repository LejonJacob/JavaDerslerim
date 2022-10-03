package Day02_ScannerDataCasting;

import java.util.Scanner;

public class D02_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alip, sayinin kupunu yazdiralim
        // 1.adim : Scanner objesi olusturmak
        Scanner scan= new Scanner(System.in);

        // 2.adim kullanicidan ne istedigimizi kullaniciya söyleyelim
        System.out.println("Lütfen bir tamsayi giriniz");

        // 3. adim: istedigimiz datayi koyabilecegimiz bir variable olusturup
        //        kullanicinin girdigi degeri uygun method'la alalim
        //        ve olusturdugumuz variable'a atayalim
        int girilenSayi= scan.nextInt();
        System.out.println("Girdiginiz Sayinin Küpü :" +girilenSayi*girilenSayi*girilenSayi);

    }
}
