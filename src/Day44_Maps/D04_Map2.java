package Day44_Maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class D04_Map2 {

    public static void main(String[] args) {


        // Map'deki key listesini ve value listesini ayri ayri yazdirin

        Map<Integer, String > ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());
        // Class'imizda kullanabilmek icin bu keySet'i kaydetmek istersek

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();


        System.out.println(ogrenciMap.values());

        Collection<String> ogrenciValueCall= ogrenciMap.values();

        // 103 numarali ogrencinin bilgilerini yazdiralim
        System.out.println(ogrenciMap.get(103));

        // 103 numarali ogrencinin bransini yazdirin
        String ogrenciValue=ogrenciMap.get(103);

        String[] ogrenciValueArr= ogrenciValue.split("-");
        System.out.println("103 numarali ögrencinin bransi: " + ogrenciValueArr[4]);

        // 103 numarali ogrencinin sinifini yazdirin
        System.out.println("103 numarali ögrencinin sinifi: " + ogrenciValueArr[2]);


    }
}
