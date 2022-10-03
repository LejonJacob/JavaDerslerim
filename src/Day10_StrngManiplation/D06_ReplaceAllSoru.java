package Day10_StrngManiplation;

import java.util.Scanner;

public class D06_ReplaceAllSoru {
    public static void main(String[] args) {

        /*  Kullanicidan ismini, soyismini ve K.Karti numarsini alip
            asgidaki formatta kaydedip, yazdiralim.

                M***** T****
                1234 **** **** ****
        */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Isminizi Giriniz");
        String isim= scanner.nextLine();
        System.out.println("Lütfen Soyadinizi Giriniz");
        String soyadi=scanner.nextLine();
        System.out.println("Lütfen Kredi Karti Numaranizi Giriniz");
        String kkno=scanner.nextLine();

        String yenisim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w", "*")+
                " " + soyadi.substring(0,1).toUpperCase()+
                soyadi.substring(1).replaceAll("\\w", "*");

        String yenikkno= kkno.substring(0,4) + "**** **** ****";

        System.out.println(yenisim + "\n" + yenikkno);




    }
}
