package Day44_Maps;

import java.util.HashMap;
import java.util.Map;

public class D01_MapOlusturma {
    public static void main(String[] args) {

        /*
           Bir lisedeki ogrenci bilgilerini tutacak bir map olusturalim
           Ogrenci numarasi key olsun,
           Isim, Soyisim, Sinif, Sube, Alan bilgileri value icerisinde yer alsin
           key: 101
           value: Ali, Can, 10, H, MF

           Bir map olusturulurken öncelikle key ve value'nin data türlerine karar verilir.

           Value birden fazla bilgi birlestirilerek olusturulmussa
           1- Buradaki bilgilerin sirasi
           2- Bilgiler arasinda kullanilacak ayrac standart olmalidir
        */


        Map<Integer, String > ogrenciMap= new HashMap<>();

        ogrenciMap.put(101, "Ali - Can - 10 - H - MF" );
        ogrenciMap.put(102, "Veli - Cem - 11 - M - SOZ");
        System.out.println(ogrenciMap);
        // {101=Ali - Can - 10 - H - MF, 102=Veli - Cem - 11 - M - SOZ}

        // Standart giris acisindan map'de herseyi method ile yapmakta fayda vardir.



    }
}
