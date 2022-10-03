package Day26_StaticKeyword;

public class D03_staticKeyword3 {
    public static void main(String[] args) {

        // hic obje olusturmadan
        // C01'deki static variable'lari kullanabiliriz
        System.out.println(D01_staticKeyword.sayi); //10

        D01_staticKeyword.sayi=20;
        System.out.println(D01_staticKeyword.sayi); //20

        D01_staticKeyword obj=new D01_staticKeyword();
        System.out.println(obj.no + ", " + obj.sayi); // 20, 20

        /*
         static variable'lar class'a aittir ve class ile birlikte olusturulur
         hic obje olusturmasak da static variable'lar kullanilabilir
         veya update edilebilir

         14. instance no variable'nin degerini bulmak icin
             objenin olusturuldugu 13.satirdan sonrasini inceleriz

          Ancak
          14.satirda static sayi variable'in degerini gormek icin
          class'in basindan itibaren 14.satira kadar
          static variable'i takip etmeliyiz.
         */
    }
}
