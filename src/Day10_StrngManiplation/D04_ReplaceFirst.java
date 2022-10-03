package Day10_StrngManiplation;

public class D04_ReplaceFirst {
    public static void main(String[] args) {

        String str="Herkesin github'ì olmali";
        System.out.println(str.replaceFirst("e", "a")); //Harkesin github'i olmali

        System.out.println(str.replace("e","a")); // Harkasin github'ì olmali

    }
}
