package Day12_forLoops;

import java.util.Scanner;

public class D03_forLoop3 {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis sayilarini alin
        // sinirlar dahil olmak uzere
        // sinirlar ve aralarindaki sayilardan 5 ile bolunebilenleri yazdirin
        // NOT : kullanici once buyuk sayi, sonra kucuk sayi girebilir

        Scanner scan= new Scanner(System.in);
        System.out.println("baslangic sayisini girin");  // 90
        int bas=scan.nextInt();

        System.out.println("bitis degerini girin"); // 57
        int bitis= scan.nextInt();


        if (bas>bitis){
            for (int i = bas; i >= bitis ; i--) {
                if (i%5==0) System.out.print(i + " ");
            }
        }else{ // bas<bitis
            for (int i = bas; i <=bitis ; i++) {
                if (i%5==0) System.out.print(i + " ");

            }
        }
    }
}