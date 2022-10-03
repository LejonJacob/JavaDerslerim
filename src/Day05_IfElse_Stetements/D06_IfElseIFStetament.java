package Day05_IfElse_Stetements;

import java.util.Scanner;

public class D06_IfElseIFStetament {
    public static void main(String[] args) {

        /*
        Ogrencinin notu 85 ve ustu ise AA,
        (85 ve ustu  degilse) 65 ve ustu ise BB,
        (65 ve ustu  de degilse) 50 ve ustu ise CC,
        (geriye kalanlar) DD
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz");

        double not= scan.nextDouble();

        if (not>=85){
            System.out.println("AA");
        }
        else if (not>=65){
            System.out.println("BB");
        }
        else if (not>=50){
            System.out.println("CC");
        }
        else if (not<50){
            System.out.println("DD");

        }
    }
}
