package Day40_AbstractClasses;

import Day14_MethodCreation.D03_MethodOlusturma;

public class EKepekliEkmek extends CAbstractEkmek {


    @Override
    public void un() {
        System.out.println("Kepekli ekmekte %30 kepek iceren un kullanilir");

    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmekte binde 1 maya kullanilir");

    }

    @Override
    public void bicim() {
        System.out.println("Kepekli ekmek farkli bicimlerde olabilir");

    }

    @Override
    public void gramaj() {
        System.out.println("Kepekli ekmek farkli gramajlarda olabilir");

    }

    public static void main(String[] args) {

        // class'lar kendi objelerini uretmek icin olusturulmus kaliplardir

        D03_MethodOlusturma obj= new D03_MethodOlusturma();

        AEkmek obj2= new AEkmek();

        // Baska class'dan olusturulan objeler kendi class'imizin obje;leri degildir
        // sadece o class'lardaki methodlardan faydalanmak icin araci olarak kullanabilecegimiz objelerdir

    }


}
