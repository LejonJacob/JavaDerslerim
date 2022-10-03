package Day16_Scope;

public class D04_Scope {
    static int a=10;
    int b;
    static int c;

    public static void main(String[] args) {

        D04_Scope obj1= new D04_Scope();
        System.out.println(obj1.b); // 0
        System.out.println(obj1.a); // 10  static variable'lara ulasmak icin objeye ihtiyac yoktur
        System.out.println(a); // 10
        System.out.println(obj1.c); // 0
        System.out.println(c); // 0

        obj1.b++;
        obj1.a++;

        D04_Scope obj2= new D04_Scope();
        System.out.println(obj2.a); // 11
        D04_Scope obj3= new D04_Scope();

    }
}
