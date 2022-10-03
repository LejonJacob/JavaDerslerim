package Day41_Interfaces;

public class NChildOf_In06 implements D06_interface {

    @Override
    public void method1() {
    }
    public static void main(String[] args) {
        D06_interface.method3();
        NChildOf_In06 obj = new NChildOf_In06();
        obj.method2();
    }
}
