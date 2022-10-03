package Day38_Exceptions2;

import java.util.Scanner;

public class D07_IllegalArgumentException {
    public static void main(String[] args) {


        /*
          Biz istersek, kontrollu olarak da exception firlattirabiliriz
          bu exception'in türü tamamen bizim tercihmize baglidir.

          Bir throw keword'u ile sadece 1 exception firlatilabilir.
          Throw kelimesinden sonre new + exception class'i + ("hata mesaji") yazilir.

          Kullanicidan yasini isteyin
          Kullanici negatif yas girerse
          illegalInputException firlatip calismayi durdurun
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int sayi=scan.nextInt();

        if (sayi<0){
            throw new IllegalArgumentException("Yas negatif olamaz");
        }


    }
}
