package Day07_TernaryOperator;

import java.util.Scanner;

public class D04_Ternary4 {
    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin
        // Kullanicinin girdigi sayiyi kontrol edip
        // sayi cift sayi ise 2 ile carpin
        // tek sayi ise 10 ile toplayin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen Bir tam sayi Giriniz");
        int sayi= scanner.nextInt();

        System.out.println(sayi = sayi % 2 == 0 ? 2 * sayi : sayi + 10);

    }
}
