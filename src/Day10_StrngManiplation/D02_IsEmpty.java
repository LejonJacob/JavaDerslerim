package Day10_StrngManiplation;

public class D02_IsEmpty {
    public static void main(String[] args) {

        // IsEmpty metodu bir String'in bos olup olmadigini
        // kontrol etmek icin kullanilir. Bos ise true, dolu ise sonuc false verir.

        String str1="Java ögren 70.000 euroyu kap";
        System.out.println(str1.isEmpty()); // false

        String str2="";
        System.out.println(str2.isEmpty());// true

        String str3="   ";
        System.out.println(str3.isEmpty());// false
        System.out.println(str3.isBlank());// true

        System.out.println(str2.length()); // 0
        System.out.println(str3.length()); // 3 , üc tane bosluk yani karakter old. icin uzunluk 3

        /*
        Java'da null pointer diye bir isaretci var
        null pointer bir deger degildir
        ama bir String'in degerinin atanmadigini isaret eder
        Java'da bir String variable'a basta deger atamamak istersek
        iki ihtimal var
        ya null ile isaretleriz
        String str4=null;
        java yazdirdiginizda bunun null oldugunu yazdirir
        ama baska bir method calistirmak isterseniz RTE verir
        veya sadece deklare eder, deger atamayiz
        String str5;
        ne yazdirabilirsiniz, ne de herhangi bir kodda kullanabilirsiniz
        bu variable'i yazarsaniz java CTE verir
         */

        String isim1=null;  // null bir deger degildir, bu satirda bir deger atamasi yoktur
        // sadece isim1 null olarak isaretlenmistir.

        String isim2;
        System.out.println(isim1); // null
        System.out.println(isim1.length()); // NullPointerException
        // sen isim1'e deger atamadin, sadece onu bos olarak isaretledin
        // deger atamadigin bir ismi herhangi bir method'la kullanamazsin
        // System.out.println(isim1.isEmpty()); calisir ama RTE verir
        // System.out.println(isim2.isEmpty()); hic calismaz CTE verir

    }
}