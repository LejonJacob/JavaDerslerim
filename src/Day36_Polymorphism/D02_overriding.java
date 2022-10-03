package Day36_Polymorphism;

public class D02_overriding extends D01_overloading{
    public static void main(String[] args) {


        /*
          Overriding parent class'daki bir method'u child class'a uyarlamak icin kullanilir
          Overriding yapmak icin parent class'daki method ile child class'daki method'un
          signature'lari AYNI OLMALIDIR.
          Child class'a uyarlamayi method body'sinde
          Signature farkli olursa bu iki method overriden / overriding method olmaz
          farkli 2 method olur
         */

        D02_overriding obj=new D02_overriding();
        obj.islem(4,5); // 20.0
        obj.islem("Veli", "Cem"); // Veli
        obj.islem("Hasan", 4); // Hasan

        D01_overloading obj2=new D02_overriding();
        obj2.islem(5,6.4); // 32.0
        obj2.islem(5,"Ali"); // 5 Ali

        D01_overloading obj3=new D01_overloading();
        obj3.islem(5,6); ; // 11.0
        obj3.islem(5,"Ali"); // 5 Ali
    }
    public void islem(double a, double b){
        System.out.println(a * b);
    }
    public void islem(String c, int d){
        System.out.println(c);
    }


}
