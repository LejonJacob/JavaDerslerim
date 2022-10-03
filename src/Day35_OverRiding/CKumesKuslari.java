package Day35_OverRiding;

public class CKumesKuslari extends BKuslar {

    String tur="Kümes Kusu";
    String isim="Kümes kusu ismi belirtilmedi";
    String yasamYeri="Kümes kuslari kümeste yasar";

    void hareket(){
        System.out.println("Kümes kuslari yürürler");
    }

    void beslenme(){
        System.out.println("Kümes kuslari et veya ot yerler");
    }

    public static void main(String[] args) {

        CKumesKuslari kk1=new CKumesKuslari();
        System.out.println(kk1.tur); // C Kümes Kusu
        System.out.println(kk1.isim); // C Kümes Kusu ismi belirtilmedi
        System.out.println(kk1.yasamYeri); // Kümes kuslari kümeste yasar
        System.out.println(kk1.ayak); // B Kuslarin ayagi vardir

        kk1.hareket(); // C Kümes kuslari yürürler
        kk1.beslenme(); // C Kümes kuslari et veya ot yerler
        kk1.kanat(); // B Kuslar Kanatlidir
        kk1.solunum(); // B Kuslar akciger ile nefes alir
        kk1.gaga(); // B Kuslarin gagalari vardir
        kk1.cogalma(); // B Kuslar yumurtayla cogalirlar
        kk1.omur(); // A Hayvanlar yasar ve ölür


        BKuslar kk2= new CKumesKuslari();
        System.out.println(kk2.tur); // B Kus
        System.out.println(kk2.isim); // B Kus ismi belirtilmedi
        // System.out.println(kk2.yasamYeri); CTE verir
        System.out.println(kk2.ayak); // B Kuslarin ayagi vardir


        kk2.hareket(); // C Kümes kuslari yürürler
        kk2.beslenme(); // C Kümes kuslari et veya ot yerler
        kk2.kanat(); // B Kuslar Kanatlidir
        kk2.solunum(); // B Kuslar akciger ile nefes alir
        kk2.gaga(); // B Kuslarin gagalari vardir
        kk2.cogalma(); // B Kuslar yumurtayla cogalirlar
        kk2.omur(); // A Hayvanlar yasar ve ölür


        AHayvanlar kk3= new CKumesKuslari();
        System.out.println(kk3.tur); // A Hayvan
        System.out.println(kk3.isim); // A Hayvan ismi belirtilmedi
        // System.out.println(kk3.yasamYeri); // CTE verir
        // System.out.println(kk3.ayak); // B Kuslarin ayagi vardir


        kk3.hareket(); // C Kümes kuslari yürürler
        kk3.beslenme(); // C Kümes kuslari et veya ot yerler
        // kk3.kanat(); // A'da bu method olmadigi icin ve diger
        // class'lardan da Override kontrolü yapilmadigi icin CTE verir
        kk3.solunum(); // B Kuslar akciger ile nefes alir
        // kk3.gaga(); // A'da bu method olmadigi icin ve diger
        // class'lardan da Override kontrolü yapilmadigi icin CTE verir
        kk3.cogalma(); // B Kuslar yumurtayla cogalir
        kk3.omur(); // A Hayvanlar yasar ve olur

    }


}
