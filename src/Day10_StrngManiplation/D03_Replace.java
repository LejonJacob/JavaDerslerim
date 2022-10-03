package Day10_StrngManiplation;

public class D03_Replace {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.replace('J', 'j'));  // java ogren, isi kap
        System.out.println(str); // Java ogren, isi kap


        str=str.replace("isi","offer'i");
        // String'deki degisikligin kalici olmasi icin atama yapmaliyiz
        System.out.println(str); // Java ogren, offer'i kap

        System.out.println(str.replace("a","e")); // Jeve ogren, offer'i kep
        // replace method'u sarta uyan tum parcalari degistirir

        System.out.println(str.replace("ogren" , "k")); // Java k, offer'i kap

        System.out.println(str.replace("a","aaaa")); // Jaaaavaaaa ogren, offer'i kaaaap

        // Bir Stringdeki istedigimiz bir harfin hepsini veya kelimenin tümünü silmek icin
        System.out.println(str.replace("a", "")); //Jv ogren, offer'i kp
        System.out.println(str.replace("Java", "")); //ogren, offer'i kap

        // olmayan bir metni deggistirmek istersek
        System.out.println(str.replace("Jacob","Lejon")); // Java ogren, offer'i kap
    }
}