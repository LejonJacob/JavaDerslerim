package Day42_IteratorAndCollections;

import java.util.LinkedList;
import java.util.Queue;

public class D05_Queue {
    public static void main(String[] args) {

        Queue<String > yemekSirasi= new LinkedList<>();

        yemekSirasi.add("Ali");
        yemekSirasi.add("Veli");
        yemekSirasi.add("Ayse");
        yemekSirasi.add("Kemal");

        System.out.println(yemekSirasi); // [Ali, Veli, Ayse, Kemal]
        System.out.println(yemekSirasi.element()); // Ali
        System.out.println(yemekSirasi); // [Ali, Veli, Ayse, Kemal]

        System.out.println(yemekSirasi.peek()); // Ali
        System.out.println(yemekSirasi); // [Ali, Veli, Ayse, Kemal]


        Queue<String > queDeneme= new LinkedList<>();

        System.out.println(queDeneme.peek()); // null
        // System.out.println(queDeneme.element()); // Exception


        yemekSirasi.offer("Fatma");
        System.out.println(yemekSirasi); // [Ali, Veli, Ayse, Kemal, Fatma]

        System.out.println(yemekSirasi.poll()); // Listin basindaki ilk elementi silip bize veriyordu - Ali
        System.out.println(yemekSirasi); // [Veli, Ayse, Kemal, Fatma]

        System.out.println(yemekSirasi.remove()); // Listin basindaki ilk elementi silip bize veriyordu ama exceptin veriyordu - Veli
        System.out.println(yemekSirasi); // [Ayse, Kemal, Fatma]

        System.out.println(queDeneme.poll()); // null
        // System.out.println(queDeneme.remove()); // exception


    }
}
