package Day25_ConstructorCall_Static;

public class D02Car {

    String marka="Polestar";

    public static void main(String[] args) {

        D02Car car1;

        // System.out.println(car1.marka);
        // car1 olusturmak icin deger atanmadigindan
        // jav obje olusturmaya itiraz etmez ancak bunu kullanmamiza izin vermez

        D02Car car2=null;
        // System.out.println(car2.marka);
        // null ile isaretlendiginde Java '=' esittir isaretini gördügünden dolayi CTE vermez
        // ama calistirmaya kalkisinca nullPointerException hatasi verir

        D02Car car3=new D02Car();

        car3.method1();
        System.out.println(new D02Car().marka); // Polestar

    }

    private void method1() {

    }
}