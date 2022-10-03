package Day29_DateTime_Varargs;

public class D08_Varargs3 {
    public static void main(String[] args) {


        /*
           Verilen sayilardan sonucusu haric digerlerini toplayip
           bulunan toplam degerini son sayi ile carpip
           yazdiran bir method olusturun
           input 3,4,5,6
           output 3 * (4+5+6) = 45
        */

        /*
          Varargs eleman alirken sinir tanimaz
          dolayisiyla da nerede durmasi gerektigini bilemez
          Bundan dolayi Varargs'dan sonra parametre olmaz
          ya da soyle diyebiliriz
          Parametreler listelenirken, varargs EN SONDA olmalidir
          Dolayisiyla bu soruyu varargs ile cozmek istersek
          islemi method'da varargs'i islerken yapmaliyiz
         */

        islemYap(3,4,5,0,1);

    }

    public static void islemYap(int... a) {

        int toplam=0;

        for (int i = 0; i < a.length-1; i++) {
            toplam+=a[i];
        }
        System.out.println("islem sonucu : " + toplam*a[a.length-1]);

    }
}