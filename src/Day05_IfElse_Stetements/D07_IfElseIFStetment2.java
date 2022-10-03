package Day05_IfElse_Stetements;

import java.util.Scanner;

public class D07_IfElseIFStetment2 {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        ve cevirmek istedigi birimi sorun,
        istedigi birim metre veya santimetre ise cevirip yazdirin,
        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cevirmek Istediginiz Mesafeyi Km Olarak Yazin");

        int mesafe = scan.nextInt();

        System.out.println("Cevirmek Istediginiz Birimi Secin " + "\nM : Metre \nS : Santimetre");

        char tercih = scan.next().charAt(0);

        if (tercih == 'M' || tercih == 'm')
            System.out.println("Girilen Mesafenin Metre Olarak Karsiligi :" + mesafe * 1000);

        else if (tercih == 'S' || tercih == 's')
            System.out.println("Girilen mesafenin Santimeter Olarak karsiligi :" + mesafe * 100000);

        else System.out.println("istediginiz birim sisteme kayitli degil");

    }
}
