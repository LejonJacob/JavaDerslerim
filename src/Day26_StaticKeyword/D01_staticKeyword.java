package Day26_StaticKeyword;

public class D01_staticKeyword {

    static int sayi=10;

    int no=20;

    public static void main(String[] args) {

        D01_staticKeyword obj1= new D01_staticKeyword();
        obj1.no=21;
        obj1.sayi++;

        System.out.println(obj1.no + ", " + obj1.sayi);

        D01_staticKeyword obj2= new D01_staticKeyword();
        obj2.no++;
        obj2.sayi++;

        System.out.println(obj2.no + ", " + obj2.sayi);


        D01_staticKeyword obj3 = new D01_staticKeyword();
        obj3.no=25;
        obj3.sayi=35;

        System.out.println(obj3.no + ", " + sayi);

        System.out.println(obj1.no + ", " + obj1.sayi);
        System.out.println(obj2.no + ", " + obj2.sayi);


    }
}
