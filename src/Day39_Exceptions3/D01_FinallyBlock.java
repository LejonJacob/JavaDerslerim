package Day39_Exceptions3;

public class D01_FinallyBlock {
    public static void main(String[] args) {

        int a=10;

        int b=2;


        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Bölecek sayi sifir olamaz");
        } finally {
            System.out.println("Finaly Blok calisti");
        }


    }
}
