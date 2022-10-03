package Day17_Scope_Arrays;

public class D03_Runner {

    public static void main(String[] args) {

        System.out.println(D01.meslek); // Hemsire
        D01.meslek="Hemsir";

        D01 obj=new D01();
        System.out.println(obj.isim); // Isim Atanmadi
        System.out.println(obj.meslek); // Hemsir

        obj.method2();
        System.out.println(obj.isim); // Recep
        System.out.println(obj.soyisim); // Lejon
        System.out.println(obj.aktifMi); // true

        D01 obj2=new D01();
        System.out.println(obj2.isim); // Isim Atanmadi
        System.out.println(obj2.meslek); // Hemsir

    }

}
