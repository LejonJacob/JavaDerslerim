package Day20_Arrays;

import java.util.Arrays;

public class D02_StringSplitMethodu {
    public static void main(String[] args) {

        String str= "Ali topu at, at Ali at";

        String [] kelimeler=str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Ali, topu, at,, at, Ali, at]

        String[] adanAyir=str.split("a");
        System.out.println(Arrays.toString(adanAyir)); // [Ali, topu, t, t, Ali, t]

        // str stringinde kac kelime var
        System.out.println(kelimeler.length); // 6

        // str stringinde kullanilan sesli harfeleri silin
        // verilen bir stringi karakterlerine ayirmak istersek

        String[] tumkarakterler=str.split("");
        System.out.println(Arrays.toString(tumkarakterler));


        String sesliHarfOlmadan="";
        String harf="";

        for (int i = 0; i < tumkarakterler.length; i++) {
            harf=tumkarakterler[i];

            if (!(harf.equals("A") ||harf.equals("a") || harf.equals("E") || harf.equals("e") ||
                    harf.equals("i") || harf.equals("I") || harf.equals("o") || harf.equals("O")
                    || harf.equals("u") || harf.equals("U"))
            ){
                sesliHarfOlmadan +=harf;
            }
        }
        System.out.println(sesliHarfOlmadan);




    }
}
