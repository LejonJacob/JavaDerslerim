package Day41_Interfaces;

public class MChildof2Interfaces implements D04_Parent1, D05_Parent2 {

    public static void main(String[] args) {

        System.out.println(D05_Parent2.sayi1); // 50
        System.out.println(D04_Parent1.sayi2); // 20


    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }


}
