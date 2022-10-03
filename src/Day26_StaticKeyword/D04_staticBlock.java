package Day26_StaticKeyword;

public class D04_staticBlock {

    static int sayi;

    D04_staticBlock(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        D04_staticBlock obj1=new D04_staticBlock();
        System.out.println("sayi : " + sayi);
    }

    static {
        System.out.println("ustteki static block calisti");
    }

    static {
        System.out.println("static block calisti");
        sayi=40;
    }
}