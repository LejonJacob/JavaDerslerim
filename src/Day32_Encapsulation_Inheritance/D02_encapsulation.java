package Day32_Encapsulation_Inheritance;

public class D02_encapsulation {
    public static void main(String[] args) {

        D01 obj= new D01();
        System.out.println(obj.getYas()); // 0


        obj.setYas(-20);
        System.out.println("yas : "+ obj.getYas()); // 0

        /*
         biz bir objeye deger atamasini kontrol edemeyiz
         kullanici kac degerini atarsa
         Java o degeri kullanir
         Encapsulation'in faydalarindan biri de
         bu deger atamasini getter veya setter method'larinda kontrol edebilmektir.
         */

        System.out.println(D01.getHastaneAdi()); // Yildiz Hastanesi
        //C01.hastaneAdi="Gicik Hastane";
        System.out.println(D01.getHastaneAdi()); // Yildiz Hastanesi

        // Google
        // google
    }
}