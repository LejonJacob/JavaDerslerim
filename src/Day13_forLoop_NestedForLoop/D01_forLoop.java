package Day13_forLoop_NestedForLoop;

import java.util.Scanner;

public class D01_forLoop {
    public static void main(String[] args) {

        // Kullanicidan bir String alip tersten yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        // Java candir

        for (int i = cumle.length()-1; i >=0; i--) {
            System.out.print(cumle.charAt(i));
        }
        // terse cevirdigimiz hali orjinal haliyle ayni mi ?
    }
}