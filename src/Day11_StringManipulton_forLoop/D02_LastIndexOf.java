package Day11_StringManipulton_forLoop;

public class D02_LastIndexOf {
    public static void main(String[] args) {

        String str= "Java cok guzel, cok";

        System.out.println(str.indexOf("cok")); //cok kelimesi 5. indexden basladigi icin indexof=5 olur
        System.out.println(str.lastIndexOf("cok")); // 16, sondan baslayarak ilk cok kelimesinin indeksini verir.

        System.out.println(str.indexOf('o')); // 6 , bastan baslayarak ilk o harfininin indeksini verir.
        System.out.println(str.lastIndexOf('o')); // 17 , sondan baslayarak ilk o harfininin indeksini verir.

        System.out.println(str.indexOf("cok", 10)); //ilk 10. index ve sonrasinda arama yapmaya baslar
        System.out.println(str.lastIndexOf("cok", 10));// sondan 10. indexten itibaren arama yamaya baslar

        /*
          Kullanicidan bir cumle ve bir kelime isteyin
          cumlede kelimenin kullanimina gore
          asagidaki cumlelerden uygun olani yazdirin
          - cumle aradiginiz kelimeyi icermiyor
          - aradiginiz kelime cumlede sadece 1 tane var
          - aradiginiz kelime cumlede birden fazla var
         */


        String aranankelime="guzel";

        int ilkIndex= str.indexOf(aranankelime);
        int sonIndex= str.lastIndexOf(aranankelime);

        if (!str.contains(aranankelime)){
            System.out.println("cumle aradiginiz kelimeyi icermiyor");
        } else if (ilkIndex==sonIndex) {
            System.out.println("aradiginiz kelime cumlede sadece 1 tane var");
        }else {
            System.out.println("aradiginiz kelime cumlede birden fazla var");
        }


    }
}
