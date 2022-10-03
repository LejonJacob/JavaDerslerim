package Day23_Constructor;

public class D02_constructor {
    public static void main(String[] args) {




        Araba arb1= new Araba();
        arb1.marka="Volvo";
        arb1.model="XC60";

        System.out.println("Marka: " + arb1.marka + "  Model: "+ arb1.model);

        Araba arb2=new Araba();
        System.out.println("Marka: " + arb2.marka + "  Model: "+ arb2.model); // null, null

        Araba arb3= new Araba("XC60");


    }
}
