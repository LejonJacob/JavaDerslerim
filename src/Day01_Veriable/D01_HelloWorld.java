package Day01_Veriable;

public class D01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello new world" );

        // buraya yazilan yazilari java okumaz//
        /* Bu satirlara Comment denir */
        /* Birden fazla satiri comment yapmak icin kullanilir */

        int numara=20;
        int sayi=12;

        System.out.println(sayi); //12

        /*
        System.out.println(numara);
        Java deger atamasi olmadan sadece deklarasyon yapmamiza izin verir
        ancak deger atamasi yapmadan kullanmamiza izin vermez
         */

        numara=21;
        System.out.println(numara); //21
        /*
        String numara=40;
        deklarasyon sadece bir kere olur
        ama deger atamasi istedigimiz kadar yapilabilir
         */

    }
}
