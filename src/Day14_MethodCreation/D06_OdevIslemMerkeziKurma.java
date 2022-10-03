package Day14_MethodCreation;

import java.util.Scanner;

public class D06_OdevIslemMerkeziKurma {
    public static void main(String[] args) {
        /*
          Basit bir islem merkezi olusturma
          Kullaniciya 4 tercih sunup istedigini gerceklestirecek 4 method olusturun
          1- Girilen sayi asal sayi mi ?
          2- Girilen sayi palindrome mu ?
          3- Girilen sayiyi tam olarak bolen tamsayilarin adedini bulun ?
          4- Sayinin rakamlar toplami
                4 method'da string olarak sonucu donecek
          main method'da sonuc bir variable'a kaydedecek
          ve sonra yazdiracak
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen yapmak istediginiz islemi seciniz" +
                "\nA- Asal sayi mi?" +
                "\nB- Sayi palindrome mu?" +
                "\nC- Tam bolen sayisi kac tane " +
                "\nD- Sayinin rakamlar toplami kac?");
        char tercih = scan.next().toUpperCase().charAt(0);

        String sonuc="";
        switch (tercih) {
            case 'A' :
                sonuc = sayiAsalMi(sayi1);
                break;
            case 'B' :
                sonuc = sayipalindromeMu(sayi1);
                break;
            case 'C' :
                sonuc = tamBolensayisiBul(sayi1);
                break;
            case 'D' :
                sonuc = rakamlarToplaminiBul(sayi1);
                break;
        }
        System.out.println("istediginiz sayi icin sonuc : " + sonuc);
    }

    public static String sayiAsalMi(int sayi1) {
        boolean sayiAsalMi = true;
        String sonuc = "";

        for (int i = 2; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                sonuc = "Girdiğiniz sayi asal sayi değil";
                sayiAsalMi = false;
                break;
            }
        }
        if (sayiAsalMi) {
            sonuc = "Girdiginiz sayi asal";
        }
        return sonuc;
    }

    public static String sayipalindromeMu(int sayi1){
        String sayiStr=sayi1+"";
        String tersSayi="";
        String sonuc="";

        for (int i = sayiStr.length()-1; i >= 0; i--) {
            tersSayi+=sayiStr.substring(i,i+1);
        }
        if (sayiStr.equals(tersSayi)){
            sonuc="Sayi Palindrome";
        }else {
            sonuc="Sayi palindrome degil";
        }
        return sonuc;

    }
    public static String tamBolensayisiBul(int sayi1) {
        int tamBolenSayisi=0;
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1 % i ==0) {
                tamBolenSayisi++;
            }
        }
        return tamBolenSayisi+"";
    }
    public static String rakamlarToplaminiBul(int sayi1) {
        String sayiStr = sayi1 + "";
        int basSayisi = sayiStr.length();
        int birlerBas = 0;
        int rakamlarTop = 0;
        for (int i = 1; i <= basSayisi; i++) {
            birlerBas = sayi1 % 10;
            rakamlarTop += birlerBas;
            sayi1 = sayi1 / 10;
        }
        return rakamlarTop+"";


    }
}

