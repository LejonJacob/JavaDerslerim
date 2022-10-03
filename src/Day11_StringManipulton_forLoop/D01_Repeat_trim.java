package Day11_StringManipulton_forLoop;

public class D01_Repeat_trim {
    public static void main(String[] args) {

        //repeat belirtilen String'i girdigimiz deger kadar tekrar yazdirarak cikti verir.

        String str= "Java Candir";

        System.out.println(str.repeat(4)); //Java Candir Java Candir Java Candir Java Candir

        str= "   Ali kos   ";
        str=str.trim();
        System.out.println(str); // Ali kos


    }
}
