package Day03_MatematikselIslemler_Increment;

public class D04_Incrementler {

    public static void main(String[] args) {

        int a=12;
        int b=8;

        a += b;
        System.out.println(" a : " + a + ", b : " + b); // 20 , 8

        a--;
        b++;
        System.out.println(" a : " + a + ", b : " + b); // 19 , 9

        a/=b;
        System.out.println(" a : " + a + ", b : " + b); // 2, 9

        b*=3;
        System.out.println(" a : " + a + ", b : " + b); // 2 , 27

    }
}
