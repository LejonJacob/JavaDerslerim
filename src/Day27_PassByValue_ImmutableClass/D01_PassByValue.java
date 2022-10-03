package Day27_PassByValue_ImmutableClass;

public class D01_PassByValue {
    public static void main(String[] args) {

        /*
          Main method’da verilen fiyat degerine %10, %20 ve %30 indirim yaparak,
          indirimli fiyati bize döndüren 3 method olusturun.
          Main method’dan bu 3 method’u arka arkaya cagirip, return edilen fiyatlari yazdirin.
        */


        double fiyat=100;

        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap20(fiyat));
        System.out.println(indirimYap30(fiyat));
        System.out.println(indirimYap20(fiyat));

    }

    private static double indirimYap30(double fiyat) {

        return fiyat*0.70;
    }

    private static double indirimYap20(double fiyat) {

        return fiyat*0.80;
    }

    public static double indirimYap10(double fiyat) {

        fiyat=fiyat*0.90;
        return fiyat;
    }

}
