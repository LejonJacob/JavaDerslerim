package Day05_IfElse_Stetements;

import java.util.Scanner;

public class D05_IfElseStetament {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char girilenChar=scan.next().charAt(0);

        if (girilenChar>='a' && girilenChar<='z'){
            System.out.println((char)(girilenChar-32));
        } else {
            System.out.println(girilenChar);

        }

    }
}
