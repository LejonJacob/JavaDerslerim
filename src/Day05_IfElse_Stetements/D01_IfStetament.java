package Day05_IfElse_Stetements;

import java.util.Scanner;

public class D01_IfStetament {
    public static void main(String[] args) {

        // basit if cumleleri ile ilgili ornek
        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz");

        double not=scanner.nextDouble();

        if (not>=50){
            System.out.println("Sinifi gectiniz");}

        if (not<50){
            System.out.println("Maalesef Sinifi Gecemediniz");

        }
    }
}
