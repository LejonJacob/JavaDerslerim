package Day22_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D01_ArrayList {
    public static void main(String[] args) {

        /*
        Kullanicidan istedigi kadar String olarak bir liste olusturup bu listeyi bize döndüren
        bir method olusurun, kullanicinin bitirmesi icin Q harfine basmasini saglayin
        */

        List<String> istenenList=new ArrayList<>();

        istenenList= listeOlustur();
        System.out.println(istenenList);


    }

    public static List<String> listeOlustur() {

        List<String> olusanList=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        String kullaniciGirisi="";

        while ( ! kullaniciGirisi.equalsIgnoreCase("Q")){

            System.out.println("Lütfen listeye eklemek icin bir isim girin" + "\nBitirmek icin Q'ya basin");

            kullaniciGirisi= scanner.nextLine();

            if(! kullaniciGirisi.equalsIgnoreCase("Q")){

                olusanList.add(kullaniciGirisi);
            }

        }
            return olusanList;
    }
}
