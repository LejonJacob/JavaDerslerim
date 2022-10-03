package Day15_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class D05_WhileLoop {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int sayi=10;
        int sayac=0;
        int sayilarToplami=0;

        while (sayi !=0){
            System.out.println("Toplamak üzere pozitif bir sayi giriniz" +
                    "\n bitirmek icin 0'a basiniz");
            sayi= scanner.nextInt();


            if(sayi==0){
                continue;
            } else if (sayi<0) {
                System.out.println("negatif sayi kullanamazsiniz");

            }else {
                sayilarToplami +=sayi;
                sayac++;
            }

        }
        System.out.println("Girilen " + sayac+ " adet sayinin tplami : " + sayilarToplami);

    }
}
