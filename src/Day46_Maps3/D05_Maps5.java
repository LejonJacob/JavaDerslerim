package Day46_Maps3;

import Day44_Maps.D02ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class D05_Maps5 {
    public static void main(String[] args) {

        Map<String,Integer> ornekMap=new HashMap<>();

        ornekMap.put("a", 3);
        ornekMap.put("b", 1);
        ornekMap.put("c", 2);
        ornekMap.put("d", 5);
        System.out.println(ornekMap); // {a=3, b=1, c=2, d=5}

        System.out.println(ornekMap.containsValue(5));// true


        Map<Integer, String > ogrenciMap= D02ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        System.out.println(ornekMap.containsValue("Ali")); // false
        // containsValue("istenenDeger") methodu tam olarak value girilirse bize true döner
        // ancak value icerisndeki bir degeri aratirsaniz bize false döner
        System.out.println(ogrenciMap.containsValue("Ali-Cem-11-B-TM")); // true

        System.out.println(ornekMap.replace("d", 10)); // Eski degerini(5) döndürüp yeni degeri 10 yapar
        System.out.println(ornekMap); // {a=3, b=1, c=2, d=10}

        System.out.println(ornekMap.replace("a", 5, 8)); // false
        System.out.println(ornekMap.replace("b", 1, 2)); // true
        System.out.println(ogrenciMap); // {a=3, b=2, c=2, d=10}


        System.out.println(ornekMap.get("b")); // 2
        System.out.println(ornekMap.get("z")); // null
        System.out.println(ornekMap.getOrDefault("a", 6)); // 3
        System.out.println(ornekMap.getOrDefault("m", 0)); // 0
        System.out.println(ornekMap); // {a=3, b=2, c=2, d=10}


    }
}
