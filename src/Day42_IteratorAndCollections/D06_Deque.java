package Day42_IteratorAndCollections;

import java.util.Deque;
import java.util.LinkedList;

public class D06_Deque {
    public static void main(String[] args) {


        Deque<String> stokList= new LinkedList<>();

        // Doque, cift tarafli Queue demektir
        // Yani iki taraftan da ekleme yapilabilir ve silinebilir.Yani hem bastan hem sondan ekleme yapilip silinebilir


        stokList.addLast("Malzeme 1");
        stokList.addFirst("Malzeme 2");
        System.out.println(stokList);

        System.out.println(stokList.pop()); // ilk siradaki elementi silip bize verir - Malzeme 2
        System.out.println(stokList); // [Malzeme 1]

        stokList.push("Malzeme 3");
        System.out.println(stokList); // [Malzeme 3, Malzeme1]

    }
}
