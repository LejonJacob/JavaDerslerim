package Day12_forLoops;

import java.util.Scanner;

public class D04_forLoop4 {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tam sayi alin
        // 1'den o sayiya kadar (sayi dahil) tum sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");
        int sayi= scan.nextInt(); // 25

        int sayiToplami=0;

        for (int i = 1; i <=sayi ; i++) {
            sayiToplami+=i;
        }
        System.out.println("Toplam : " + sayiToplami);
    }
}

