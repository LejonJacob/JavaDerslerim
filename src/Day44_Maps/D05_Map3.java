package Day44_Maps;

import java.util.List;
import java.util.Map;

public class D05_Map3 {

    public static void main(String[] args) {


        // Subesi B olan ogrencilerin isimlerini bir liste olarak yazdiran bir method olusturun

        Map<Integer, String > ogrenciMap=D02ReusableMethods.ogrenciMapOlustur();

        List<String> subedekiOgrencilerList = D02ReusableMethods.istenenSubdekiOgrenclerListesiOlustur(ogrenciMap, "B");

        System.out.println(ogrenciMap);
        System.out.println(subedekiOgrencilerList);

    }
}
