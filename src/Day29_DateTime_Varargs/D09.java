package Day29_DateTime_Varargs;

public class D09 {
    public static void main(String[] args) {

        new D09().D09(1, "Java");

        D09 obj=new D09();
        obj.D09(2, "Java", "Güzeldir");

    }

    public void D09(int a, String... b){

        System.out.print(b[b.length-a] +" ");

    }
}
