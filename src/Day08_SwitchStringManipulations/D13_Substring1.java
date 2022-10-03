package Day08_SwitchStringManipulations;

public class D13_Substring1 {
    public static void main(String[] args) {

        String str= "Java Guzeldir.";
        System.out.println(str.substring(1,3)); // av
        System.out.println(str.substring(5,10)); // Guzel
        System.out.println(str.substring(0,10)); // Java Guzel

        // son 3 karakter haric tum metni yazdiralim
        System.out.println(str.substring(0, str.length()-2)); //Java Guzeldi

        System.out.println(str.substring(3,3)); // Hiclik yazdirir


        System.out.println(str.substring(5,6)); // sadece 5. indexteki harfi yazdiralim
        System.out.println(str.substring(2,3)); // sadece 5. indexteki harfi yazdiralim

        //System.out.println(str.substring(5,2)); // Java bunu calistirmaz, Runtime error verir


    }
}
