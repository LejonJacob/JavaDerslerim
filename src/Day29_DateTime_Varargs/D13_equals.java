package Day29_DateTime_Varargs;

public class D13_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Ali Can");

        StringBuilder sb2=new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1==sb2); // false

        System.out.println(sb1.equals(sb2)); //false

        System.out.println(sb1.equals(sb1));

        // System.out.println(sb1==str); farkli data türleri oldugu icin Java CTE verir.

        System.out.println(sb1.equals(str)); // false

    }
}
