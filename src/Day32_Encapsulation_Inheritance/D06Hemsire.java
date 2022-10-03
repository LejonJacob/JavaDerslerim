package Day32_Encapsulation_Inheritance;

public class D06Hemsire extends D04Muhasebe {

    public static void main(String[] args) {

        /*
        Extends keyword ile parent edindigimizde
        parent class'daki access modfier'i
        public ve protected olanlari inherit edebiliriz
        access modifier'i default ise sadece ayni package'da isek inherit edebiliriz
        access modfier'i private ise inherit edemeyiz
        (encapsule edilmisse getter setter ile kullanabiliriz)
        */

        D06Hemsire hmsr1=new D06Hemsire();
        hmsr1.isim="Ayse";
        hmsr1.soyisim="Yilmaz";

    }
}
