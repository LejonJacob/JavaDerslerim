package Day45_Maps2;

import Day44_Maps.D02ReusableMethods;

import java.util.Map;
import java.util.Set;

public class D02_EntrySet {
    public static void main(String[] args) {

        // Tüm ögrencilerin bilgilerini bir liste seklinde kullanicilara yazdiralim.
        // No, Isim, Soyisim, Sinif, Sube ve Bölüm
        // örnegin: 101

        /*

        {101=Ali - Can - 10 - H - MF, 102=Veli - Cem - 11 - M - SOZ, 103=Ali -Yan- 11 - B - TM, 104=Ayca - Can - 11 - B - SOZ, 105=Ayse - Tan - 10 - M - SOZ}
         Java Map'lerde key ve value'yu birlikte manipule(islem yapmak) edebilmemiz icin
         Map'lere özel Entry Class' olusturmustur

         101=Ali - Can - 10 - H - MF      1.Entry
         102=Veli - Cem - 11 - M - SOZ    2.Entry

         */


        Map<Integer, String> ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();
        System.out.println("No:  Isim:  Soyisim:  Sinif:  Sube:  Bolüm:");

        // Map'deki tüm entry'leri bir set'e store(kaydettik) ettik
        Set<Map.Entry<Integer, String>> ogrenciEntrySet= ogrenciMap.entrySet();

        for (Map.Entry<Integer, String > each : ogrenciEntrySet) {

            Integer tempKey= each.getKey();
            String tempValue= each.getValue();
            String [] tempValueArr= tempValue.split("-");

            System.out.println(tempKey+ " " +
                                tempValueArr[0]+" "+
                                tempValueArr[1]+" "+
                                tempValueArr[2]+" "+
                                tempValueArr[3]+" "+
                                tempValueArr[4]);

        }


    }
}
