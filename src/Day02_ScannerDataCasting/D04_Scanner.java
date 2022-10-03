package Day02_ScannerDataCasting;

import java.util.Scanner;

public class D04_Scanner {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Isminizi Giriniz");
        String isim= scan.nextLine();

        System.out.println("Lütfen Soyadinizi Giriniz");
        String soyad= scan.nextLine();

        System.out.println("Lütfen Yasinizi Giriniz");
        String yas= scan.nextLine();

        System.out.println("Isminiz :" + isim + "\nSoyadiniz: " + soyad +
                "\nYasiniz :" + yas +
                "\nKaydiniz basariyla tamamlanmistir.");

        /*
          String ile scan.next() ve scan.nextLine() kullanilabilir
          next() sadece ilk space'e kadar olan kismi alirken
          nextLine() tum satiri alir
          Arka arkaya birden fazla String degeri kullanicidan alinacaksa
          hata olmamasi icin nextLine() kullanilmasi daha iyi olur
         */


    }
}
