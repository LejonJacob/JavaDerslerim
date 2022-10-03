package Day25_ConstructorCall_Static;

public class D01Araba {

    int yil;
    String marka;

    D01Araba() {
        yil = 2015;
    }

    public D01Araba(int yil, String marka) {

        this();
        this.yil = yil;
        this.marka = marka;
    }

    public D01Araba(int yil) {

        this(yil, "Opel");
        this.yil = yil;

    }

    public static void main(String[] args) {

        D01Araba arb3 = new D01Araba(2020, "Volvo");
        System.out.println(arb3);

        D01Araba arb2 = new D01Araba(2020);
        System.out.println(arb2);

        D01Araba arb1 = new D01Araba();
        System.out.println(arb1);
    }

    @Override
    public String toString() {
        return "Araba : " +
                "yil: " + yil +
                ", marka: " + marka ;
    }
}
