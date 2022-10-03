package Day08_SwitchStringManipulations;

import java.util.Scanner;

public class D05_SwitchCase3 {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan ay ismini alip mevsimi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Ay Ismini Giriniz");
        String girilenAy= scanner.next();


        // kullanici ay ismini farkli sekillerde yazabilecegi icin
        // biz girilen degeri standartlastirmak icin
        // yeni bir variable'a kucuk harf olarak atayalim

        String ayIsmi= girilenAy.toLowerCase();

        switch (ayIsmi){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Girdiginiz" + girilenAy + "ayi Kis Mevsimi aylarindandir");
                break;

            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Girdiginiz" + girilenAy + "ayi Bahar Mevsimi aylarindandir");
                break;

            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Girdiginiz" + girilenAy + "ayi Yaz Mevsimi aylarindandir");
                break;

            case "eylül":
            case "ekim":
            case "kasim":
                System.out.println("Girdiginiz" + girilenAy + "ayi Son Bahar Mevsimi aylarindandir");
                break;

                default:
                System.out.println("gecersiz ay ismi");

        }
    }
}
