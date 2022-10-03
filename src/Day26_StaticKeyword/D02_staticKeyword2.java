package Day26_StaticKeyword;

public class D02_staticKeyword2 {
    public static void main(String[] args) {

        D01_staticKeyword obj1= new D01_staticKeyword();
        System.out.println(obj1.no + ", " + obj1.sayi);

        obj1.no=25;
        obj1.sayi=30;

        D01_staticKeyword obj2= new D01_staticKeyword();

        obj2.no++;
        obj2.sayi++;

        System.out.println(obj2.no + ", " + obj2.sayi);

        obj2.no=40;
        obj2.sayi++;

        D01_staticKeyword obj3=new D01_staticKeyword();

        System.out.println(obj1.no + ", " + obj1.sayi);
        System.out.println(obj2.no + ", " + obj2.sayi);
        System.out.println(obj3.no + ", " + obj3.sayi);


    }
}
