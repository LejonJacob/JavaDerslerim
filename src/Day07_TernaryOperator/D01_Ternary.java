package Day07_TernaryOperator;

import java.util.Scanner;

public class D01_Ternary {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Bir sayi giriniz");

        int sayi= scanner.nextInt();

        System.out.println(sayi %5==0 ? "Sayi 5'in tam kati" :
                "sayi 5'in tam kati degil");



    }
}
