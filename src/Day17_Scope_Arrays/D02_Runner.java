package Day17_Scope_Arrays;

public class D02_Runner {

    public static void main(String[] args) {

        /*
         Bir class'dan baska bir class'daki static variable
         ve method'lara ulasmak icin
         classismi.variableIsmi yazmak yeterlidir.
         bir class'dan baska bir class'daki
         instance variable'lara erismek icin
         object olusturmamiz lazim
        */

        System.out.println(D01.meslek);
        D01.meslek="Hemsir";
        System.out.println(D01.meslek);
        D01.method1();

        D01 obj1= new D01();
        obj1.isim="Ayse";
        obj1.soyisim="Yildiz";
        obj1.aktifMi=true;

        System.out.println(obj1.isim); // Ayse
        System.out.println(obj1.meslek); // hemsir
        System.out.println(D01.meslek); // hemsir
        D01.meslek="Yardimci Doktor";

        D01 obj2=new D01();
        System.out.println(obj2.isim); // Isim Atanmadi
        System.out.println(obj2.meslek); // Yardimci Doktor

    }

}
