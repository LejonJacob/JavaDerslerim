package Day11_StringManipulton_forLoop;

import java.util.Scanner;

public class D04_Soru2 {
    public static void main(String[] args) {

        /*
          Kullanicidan bir sayi alin
          - sayi 3 ile bolunuyorsa "3 ile bolunen sayi"
          - 5 ile bolunuyordsa "5 ile bolunen sayi"
          - hem 3, hem 5 ile bolunuyorsa "Super sayi"
          - geriye kalanlar icin "onemsiz sayi" yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("super sayi");
        } else if (sayi%3==0) {
            System.out.println("3 ile bolunen sayi");
        } else if (sayi%5==0) {
            System.out.println("5 ile bolunen sayi");
        }else{
            System.out.println("onemsiz sayi");
        }


    }
}

