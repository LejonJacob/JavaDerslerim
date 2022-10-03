package Day05_IfElse_Stetements;

import java.util.Scanner;

public class D02_IfElse_Stetament {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        /*
        Eger if ile yazdigimiz bir kodda sadece 2 ihtimal varsa
        bu durumda if-else cumleleri kullaniriz
        tanimdan da anlayacagimiz uzere
        sadece iki ihtimal vardir
        ve sadece ikisinden biri calisir
        ikisinin birden calisma ihtimali --- YOKTUR
        hic birinin calismama ihtimali--- YOKTUR
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz");

        double not= scan.nextDouble();

        if (not >= 50) {
            System.out.println("Dersi Gectiniz");
        } else {
            System.out.println("Maalesef Kaldiniz");
        }

    }
}
