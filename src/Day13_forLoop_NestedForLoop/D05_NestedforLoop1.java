package Day13_forLoop_NestedForLoop;

import java.util.Scanner;

public class D05_NestedforLoop1 {
    public static void main(String[] args) {

        /*
         Asagidaki sekli yazdiran bir program yaziniz
         kac satir oldugu ve stirda kac yildiz olacagi input olarak veriliyor
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
        */

        int satirsayisi= 6;
        int satirdakiyildizSayisi=13;

        for (int i = 1; i <=satirsayisi ; i++) {

            for (int j = 1; j <=satirdakiyildizSayisi ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}