package Day08_SwitchStringManipulations;

import java.util.Scanner;

public class D04_SwitchCase2 {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Bir akam Giriniz");
        int rakam= scanner.nextInt();

        switch (rakam){
            case 0:
                System.out.println("Sifir");
            case 1:
                System.out.println("Bir");
            case 2:
                System.out.println("Iki");
            case 3:
                System.out.println("Üc");
            case 4:
                System.out.println("Dört");
            case 5:
                System.out.println("Bes");
            case 6:
                System.out.println("Alti");
            case 7:
                System.out.println("Yedi");
            case 8:
                System.out.println("Sekiz");
            case 9:
                System.out.println("Dokuz");
            default:
                System.out.println("Rakam girmelisiniz");


        }
    }
}
