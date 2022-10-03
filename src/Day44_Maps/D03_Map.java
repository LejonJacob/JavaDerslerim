package Day44_Maps;

import java.util.Map;

public class D03_Map {
    public static void main(String[] args) {

        Map<Integer, String > ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();

        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-MF, 103=Ali-Cem-11-B-MF, 104=Ayca-Can-11-B-MF, 105=Ayse-Tan-10-M-SOZ}

        // Kullanicidan ögrenci ile ilgili bilgileri alip Map'e ekleyelim

        ogrenciMap= D02ReusableMethods.mapeOgrenciEkle(ogrenciMap);
        System.out.println(ogrenciMap);

        /*
         Map'e element eklemek icin put() methodu kullanilir
         value girilirken eski elementlerle ayni formatta olmalidir
        */

    }
}
