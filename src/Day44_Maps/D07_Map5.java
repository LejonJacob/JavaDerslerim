package Day44_Maps;

import java.util.List;
import java.util.Map;

public class D07_Map5 {
    public static void main(String[] args) {


        // Verilen sinif'daki ogrencilerin isim ve soyisimlerini liste olarak donduren bir method olusturun.


        Map<Integer, String> ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();

        List<String> sinifOgrenciListesi=D02ReusableMethods.siniftakiOgrenciListesiOlustur(ogrenciMap, 10);

        System.out.println(sinifOgrenciListesi);


    }
}
