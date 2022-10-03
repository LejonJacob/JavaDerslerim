package Day08_SwitchStringManipulations;

import java.util.Scanner;

public class D02_SwitchCase {
    public static void main(String[] args) {

        /*
         Kullanicidan gun numarasini alip
         gun ismini yazdiran bir program yazin
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Gün numarasi 1 ile 7 arasinda bir sayi giriniz");

        int gunNo= scanner.nextInt();

        if(gunNo<=0 ||gunNo>7 ) System.out.println("Gecersiz Gün Numarasi");

        else if (gunNo==1) System.out.println("Pazartesi");
        else if (gunNo==2) System.out.println("Sali");
        else if (gunNo==3) System.out.println("Carsamba");
        else if (gunNo==4) System.out.println("Persembe");
        else if (gunNo==5) System.out.println("Cuma");
        else if (gunNo==6) System.out.println("Cumartesi");
        else if (gunNo==7) System.out.println("Pazar");


        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun numarasi girdiniz");
        }
    }
}
