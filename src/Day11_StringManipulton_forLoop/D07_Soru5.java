package Day11_StringManipulton_forLoop;

import java.util.Scanner;

public class D07_Soru5 {
    public static void main(String[] args) {


        /*
          Kullanicidan bir sifre isteyin
          asagidaki sartlari kontrol ederek
          kullaniciya duzeltmesi gerekenleri soyleyin
          eger tum sartlari saglarsa
          "sifre basariyla kaydedildi" yazdirin

          - ilk harf kucuk harf olmali
          - son karakter rakam olmali
          - sifre bosluk icermemeli
          - uzunlugu en az 10 karakter olmali
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen en az 10 karakter uzunlugunda bir sifre giriniz.");

        String sifre= scanner.nextLine();

        //Bagimsiz if cümleleri veya if-else ile cözülebilir,
        //Ikisininde artilari ve eksileri var
        //Biz bagimsiz if'i kullanmayi sectik

        boolean kontrol=true;
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("sifre kucuk harf ile baslamali");
            kontrol=false;

        } if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("sifre rakam ile bitmeli");
            kontrol=false;

        } if (sifre.contains(" ")){
            System.out.println("Sifrede bosluk olmaz");
            kontrol=false;

        } if (sifre.length()<10){
            System.out.println("sifre en az 10 karakterli olmalidir");
            kontrol=false;

        }if (kontrol){
            System.out.println("sifre basari ile kaydedildi");
        }

    }
}
