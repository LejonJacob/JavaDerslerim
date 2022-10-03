package Day08_SwitchStringManipulations;

public class D12_Substring {
    public static void main(String[] args) {


        // substring() : verilen bir String'in istenen bir parcasini bize dondurur

        String str= "Java Güzeldir.";

        System.out.println(str.substring(2)); // va Güzeldir

        // son 3 karakterini yazdirin
        System.out.println(str.substring(10)); // dir.

        System.out.println(str.substring(str.length() - 3)); //ir.
        // dinamik oldugu icin bu sekilde yazilmasi daha iyidir

        System.out.println(str.substring(str.length()-1)); // java hiclik döndürür.

        // System.out.println(str.substring(14)); // StringIndexOutOfBoundsException
        System.out.println(str.substring(0)); // Java Guzeldir

    }
}
