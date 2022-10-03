package Day02_ScannerDataCasting;

import java.util.Scanner;

public class D06_Swap {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)

        System.out.println("Lütfen 1. tamsayi giriniz");
        int sayiA= scan.nextInt();
        System.out.println("Lutfen 2. tamsayiyi giriniz");
        int sayiB= scan.nextInt();
        System.out.println("Girilen degerler" + "\nSayi1: " + sayiA + "\nsayi2: " + sayiB);

        int sayiC;
        sayiC= sayiB;
        sayiB= sayiA;
        sayiA= sayiC;

        System.out.println("degisimden sonraki degerler" + "\nsayiA: " + sayiA + "\nsayiB: " + sayiB);



    }
}
