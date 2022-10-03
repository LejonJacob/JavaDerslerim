package Day44_Maps;

import java.util.List;
import java.util.Map;

public class D06_Map4 {
    public static void main(String[] args) {

        // Bransi verilen ogrencilerin isim ve soyismlerini liste olarak yazdirin
        // MF dedigimizde Ali Can, Ayca Can

        Map<Integer, String > ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();

        List<String> bransogrenciListesi= D02ReusableMethods.bransdakiOgrenclerLitesiOlustur(ogrenciMap, "TM");

        System.out.println(bransogrenciListesi);


    }

}
