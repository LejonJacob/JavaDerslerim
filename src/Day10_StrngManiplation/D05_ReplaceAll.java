package Day10_StrngManiplation;

public class D05_ReplaceAll {
    public static void main(String[] args) {

        /*  replace'de(eskiString, yeniString) yazdigimizda zaten eskiString ile ayni olan tüm metinleri
            yeniString ile degistiriyorduk. replaceAll methodunda ise tek tek String'leri degilde tum sayilari,
            tüm bosluklari, tüm harfaleri vs. gibi ortak özellikle tanimlanabilen karakterlerin hepsini
            toptan degistirmek icin kullanilir.
        */

        String str="Ja1va Guz2eld1ir13.";

        // replace'de eger metindeki rakamlardan kurtulmak istersek
        // 3 kere replaca yapmamiz gerekir
        str=str.replace("1","");
        str=str.replace("2", "");
        str=str.replace("3", "");
        System.out.println(str);

        str="J1a2v3a G4uz5e6l7d8i9r0.";

        //Örnegin yukaridaki cümlenin icindeki tüm rakamlardan kurtulmak istiyorsak
        System.out.println(str.replaceAll("\\d", ""));

        //Eger birden fazla bosluk olan yerleri tek bosluk haline getirmek istiyorsak
        str="Java    Güzel   bir  programlama    dilidir  .";
        System.out.println(str = str.replaceAll("\\s+", " "));

        str.replaceAll("Java", "H");
        //replaceAll'da regex yerine String'de yazilabilir.

    }
}
