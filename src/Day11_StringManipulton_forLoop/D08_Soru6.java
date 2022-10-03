package Day11_StringManipulton_forLoop;

import java.util.Scanner;

public class D08_Soru6 {
    public static void main(String[] args) {

        /*
         Kullanicidan isim ve soyismini ayri ayri alin
         ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
         soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adinizi  giriniz");
        String isim= scan.nextLine();
        System.out.println("Lütfen Soyadinizi giriniz");
        String soyad= scan.nextLine();

        if(isim.length() > soyad.length()){
            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase() +
                    " " + soyad.substring(0,1).toUpperCase() + soyad.substring(1).toLowerCase());

        } else if (isim.length() < soyad.length()) { System.out.println(isim.substring(0,1).toUpperCase() +
                isim.substring(1).toLowerCase() + " " + soyad.toUpperCase());

        } else { System.out.println(isim.toUpperCase() + " " + soyad.toUpperCase());

        }


    }
}

