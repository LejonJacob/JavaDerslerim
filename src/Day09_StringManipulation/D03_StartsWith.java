package Day09_StringManipulation;

public class D03_StartsWith {
    public static void main(String[] args) {

        String str= "Java cok güzel, cok";

        System.out.println(str.startsWith("J"));//true
        System.out.println(str.startsWith("Java"));// true
        System.out.println(str.startsWith("Java cok güzel, cok")); // true
        System.out.println(str.startsWith(""));// true

        System.out.println(str.startsWith("cok"));// false
        System.out.println(str.startsWith("cok", 5)); //true
        System.out.println(str.startsWith("guzel", 10));// false

        // System.out.println(str.startsWith(str.contains("a")));
        // java containts kismi nedeniyle en basta hata verir, bunu calistirmaz

    }
}
