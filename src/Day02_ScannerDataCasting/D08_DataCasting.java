package Day02_ScannerDataCasting;

public class D08_DataCasting {
    public static void main(String[] args) {

        double douleSayi= 23.4;
        int intSayi= (int)douleSayi;
        System.out.println(intSayi);//23

        //verilen 3 tamsayinin, ortalamasi yazdirin
        int sayi1=12;
        int sayi2=13;
        int sayi3=16;

        System.out.println((double)(sayi1 + sayi2 + sayi3)/3 );

        /*
          Eger islem yapilan tum sayilar int ise java sonucu da integer olarak verir
          ama sayilardan biri double olursa,sonucu genis olana otomatik cast eder
         */

        double sayi4=15;
        System.out.println((sayi1 + sayi4)/2);
        System.out.println(((double)sayi1+sayi2+sayi3)/3);

    }
}
