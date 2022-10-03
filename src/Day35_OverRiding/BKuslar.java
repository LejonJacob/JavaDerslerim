package Day35_OverRiding;

public class BKuslar extends AHayvanlar {

    String tur="Kus";
    String isim="Kus Isim belirtilmedi";
    String ayak="Kuslarin ayagi vardir";


    void kanat(){
        System.out.println("Kuslar Kanatlidir");
    }
    void solunum(){
        System.out.println("Kuslar akciger ile nefes alir");
    }

    void gaga(){
        System.out.println("Kuslarin gagalari vardir");
    }

    void cogalma(){
        System.out.println("Kuslar yumurtayla cogalirlar");
    }

}

