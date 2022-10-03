package Day46_Maps3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D01_Maps1 {
    public static void main(String[] args) {

        /*

        Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
        Input : {1,2,3,4,5,3,4,2,5,1,3,2,4,1,1,1,1}
        output : 1 kullanimi : 3 adet
        2 kullanimi : 3 adet
        3 kullanimi : 3 adet
        4 kullanimi : 3 adet
        5 kullanimi : 2 adet

        */

        int[] arr= {1,2,3,4,5,3,4,2,5,1,3,2,4,1,1,1,1};

        Map<Integer, Integer> kullanimSayilarMap= new HashMap<>();
        // Hedefimiz { 1=3, 2=3, 3=3, 4=3, 5=2}

        for (int each: arr) {

            // each'in key olarak map'de olup olmadigini kontrol edelim
            if (kullanimSayilarMap.containsKey(each)){

                // Key map'de varsa value'uyu 1 arttiralim
                kullanimSayilarMap.put(each, (kullanimSayilarMap.get(each) +1));
            }
            else {
                // Key map'de yoksa o zaman ekleyelim
                kullanimSayilarMap.put(each, 1);
            }

        }
        System.out.println(kullanimSayilarMap); // {1=6, 2=3, 3=3, 4=3, 5=2}


        Set<Map.Entry<Integer,Integer>> kullanimSayilariEntrySeti= kullanimSayilarMap.entrySet();

        for (Map.Entry<Integer,Integer> each1 : kullanimSayilariEntrySeti) {

            // 1 kullanimi 3 adet
            System.out.println(each1.getKey() + " kullanimi " + each1.getValue() + " adet");

        }

    }
}
