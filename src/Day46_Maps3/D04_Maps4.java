package Day46_Maps3;

import java.util.HashMap;
import java.util.Map;

public class D04_Maps4 {
    public static void main(String[] args) {


        Map<String,Integer> ornekMap=new HashMap<>();

        ornekMap.put("a", 3);
        ornekMap.put("b", 1);
        ornekMap.put("c", 2);
        ornekMap.put("d", 5);
        System.out.println(ornekMap); // {a=3, b=1, c=2, d=5}


        ornekMap.put("b", 7); // Var mi yok mu kontrol etmeden direk ekler
        ornekMap.putIfAbsent("a", 7); // Yoksa ekle dedigimizde a var oldugu icin a'yi eklemez
        ornekMap.putIfAbsent("e", 3); // Yoksa ekle dedigimizde e yok oldugu icin e'yi ekler
        System.out.println(ornekMap); // {a=3, b=7, c=2, d=5, e=3}


        ornekMap.put("g", 3); // Yok olani ekler
        ornekMap.put("a", 2); // Var olani degistirir
        ornekMap.putIfAbsent("c", 5); // Yoksa ekle dedik ama var oldugu icin buna islem yapmaz
        ornekMap.putIfAbsent("h", 4); // Yoksa ekle dedigimiz icin ekleyecek
        System.out.println(ornekMap); // {a=2, b=7, c=2, d=5, e=3, g=3, h=4}


        ornekMap.compute("a",(k, v)-> 2*v); // a'nin degerini 2 ile carpacak
        System.out.println(ornekMap); // {a=4, b=7, c=2, d=5, e=3, g=3, h=4}

        ornekMap.computeIfPresent("c", (k,v)-> 20);
        ornekMap.computeIfPresent("k", (k,v)-> 30);
        System.out.println(ornekMap); // {a=4, b=7, c=20, d=5, e=3, g=3, h=4}


        ornekMap.computeIfAbsent("c", v->15); // Yoksa ekle dedigimiz icin c var oldugu icin islem yapmaz
        ornekMap.computeIfAbsent("m", v->12); // Yoksa ekle dedigimiz icin m'yi ekler
        System.out.println(ornekMap); // {a=4, b=7, c=20, d=5, e=3, g=3, h=4, m=12}


    }
}
