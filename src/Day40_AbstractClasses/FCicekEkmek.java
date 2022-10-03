package Day40_AbstractClasses;

public class FCicekEkmek extends CAbstractEkmek {


    @Override
    public void un() {
        System.out.println("Cicek ekmekte beyaz un kullanilir");

    }

    @Override
    public void maya() {
        System.out.println("Cicek ekmekte binde 2 maya kullanilir");

    }

    @Override
    public void bicim() {
        System.out.println("Cicek ekmek cicek biciminde olur");

    }

    @Override
    public void gramaj() {
        System.out.println("Cicek ekmek icin gramaj 350 gr'dir");

    }

    @Override
    public void tuz() {
        System.out.println("Cicek ekmekte binde 1 tuz kullanilir");
    }
}
