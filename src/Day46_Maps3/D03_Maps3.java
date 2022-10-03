package Day46_Maps3;

import Day44_Maps.D02ReusableMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D03_Maps3 {
    public static void main(String[] args) {

        // Verilen bir ogrenci map’inde her sinifta kacar ogrenci oldugunu yazdiran bir method olusturun.

        Map<Integer, String > ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);


        Map<String,Integer> sinifSayilariMap= new HashMap<>();

        // ogrenci map'ini entry'lere ayirip sinif kontrolu yapmaliyiz
        Set<Map.Entry<Integer,String>> ogrenciMapEntrySeti= ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> entry: ogrenciMapEntrySeti) {

            // elimizde 101=Ali-Can-10-H-MF gibi entry'ler var
            String[] tempValueArr= entry.getValue().split("-"); // [Ali, Can, 10, H, MF]
            String sinifBilgisi=tempValueArr[2];
            // su an elimizde sinif bilgisi var
            // bunu yeni olusturdugumuz sinifSayilariMap'e ekleyecegiz

            // amacimiz sinifBilgisi daha onceden map'de varsa value'yu bir artirmak
            // sinifBilgisi daha onceden map'de yoksa map'e (sinifBilgisi,1) eklemek

            sinifSayilariMap.computeIfPresent(sinifBilgisi,(k,v)->v+1);
            sinifSayilariMap.putIfAbsent(sinifBilgisi,1);
        }
        System.out.println(sinifSayilariMap);
    }
}

