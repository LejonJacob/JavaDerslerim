package Day40_AbstractClasses;

public class DChildofAbstractEkmek extends CAbstractEkmek{

    @Override
    public void un() {
        System.out.println("Cevizli ekmek kepekli undan yapilir");
    }

    @Override
    public void maya() {
        System.out.println("Cevizli ekmekte binde 2 oraninda maya kullanilir");
    }

    @Override
    public void bicim() {
        System.out.println("Cevizli akmek somun ekmek seklindedir");
    }

    @Override
    public void gramaj() {
        System.out.println("Cevizli ekmek icin gramaj 650 gr.");
    }

    public static void main(String[] args) {

        DChildofAbstractEkmek cvzEkmk= new DChildofAbstractEkmek();

        cvzEkmk.un();
        cvzEkmk.maya();
        cvzEkmk.bicim();
        cvzEkmk.gramaj();

    }


}
